package images;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

/**
 * LICENSE: This is open-source software released under the terms of the<BR>
 * GPL (http://www.gnu.org/licenses/gpl.html).<BR><BR> 
 *
 * This class supports the processing of images.<BR><BR>  
 * 
 * Input image files must be in JPEG format.  Output files are written 
 * in JPEG format.<BR><BR>
 *
 * Example program, which loads an image from a file dialog,
 * converts it to grayscale, and draws it:<BR><BR>
 * 
 *<pre> import images.APImage;
 * import images.Pixel;
 *
 * public class TestGrayscale{
 *
 *    public static void main(String[]args){  
 *       APImage image = new APImage();
 *       for (Pixel p : image){
 *          int red = p.getRed();
 *          int green = p.getGreen();
 *          int blue = p.getBlue();
 *          int average = (red + green + blue) / 3;
 *          p.setRed(average);
 *          p.setGreen(average);
 *          p.setBlue(average);
 *       }
 *       image.draw();
 *    }
 * }</pre><BR> 
 * You can reset maximum heap size when running the program if you run 
 * out of memory for large images, as follows:<BR>
 *
 * <pre>java -Xmx<I>new Size</I>m <I>programFileName</I></pre>
 *
 * where <I>newSize</I> is an integer.  For example,<BR>
 *
 * <pre>java -Xmx128m TestGrayscale</pre>
 *
 * allows up to 128 megabytes of heap space for the TestGrayscale program.
*/

public class APImage extends JFrame implements Iterable<Pixel>{
   
    // Default width and height of blank images
    static private final int WIDTH = 200;
    static private final int HEIGHT = 200;
   
    // Instance variables
    private Pixel[] pixels;          // Array of pixels
    private Image image;             // The bitmap for display
    private ImagePanel imagePanel;   // The image's panel in its window
    private String fileName;         // The file name or empty if no file yet

    /**
     * Creates a blank image whose color is black.
     * @param width the width of the image in pixels
     * @param height the height of the image in pixels
     */
    public APImage(int width, int height){
        fileName = "";
        image = createImage(getBlankImage(width, height));
        setWindowAttributes();
    }

    /**
     * Creates an image from a given file.
     * @param fileName the name of the file
     * @throws Exception if the file does not exist or is not in JPEG format
     */
    public APImage(String fileName){
        this.fileName = fileName;
        image = getImageFromFile(fileName);
        setWindowAttributes();
    }

    /**
     * Creates an image from a file dialog selection or creates a blank image if the user cancels.
     */
    public APImage(){
        File file = openFileDialog();
        if (file == null){
            fileName = "";
            image = createImage(getBlankImage(WIDTH, HEIGHT));
	    }
	    else{
            fileName = file.getName();
            image = getImageFromFile(fileName);
	    }
	    setWindowAttributes();
    }
   
    // Creates a copy of the given image
    private APImage(APImage original){
        this(original.getWidth(), original.getHeight());
        for (int x = 0; x < original.getWidth(); x++)
            for (int y = 0; y < original.getHeight(); y++){
                Pixel p1 = original.getPixel(x, y);
                Pixel p2 = this.getPixel(x, y);
                p2.setRed(p1.getRed());
                p2.setGreen(p1.getGreen());
                p2.setBlue(p1.getBlue());
            }
    }

    /**
     * Returns the width of the image in pixels.
     * @return the image's width in pixels
     */
    public int getWidth(){
        return image.getWidth(this);
    }

    /**
     * Returns the height of the image in pixels.
     * @return the image's height in pixels
     */
    public int getHeight(){
        return image.getHeight(this);
    }

    /**
     * Returns the pixel at the given (x, y) position.
     * @param x the column position of the pixel
     * @param y the row position of the pixel
     * @return the Pixel at the given (x, y) position
     */
    public Pixel getPixel(int x, int y){
        return pixels[y * image.getWidth(this) + x];
    }

    /**
     * Resets the pixel at the given (x, y) position but does not redraw it.
     * @param x the column position of the pixel
     * @param y the row position of the pixel
     * @param p the new Pixel
     */ 
    public void setPixel(int x, int y, Pixel p){
        pixels[y * image.getWidth(this) + x] = p;
    }
   
    /**
     * Displays the image in its window.
     */ 
    public void draw(){
        setVisible(true);
        updateImage();
    } 

    /**
     * Returns a copy of the image.
     * @return an APImage representing a copy of this image
     */
    public APImage clone(){
        return new APImage(this);
    }

    /**
     * Returns a string representation of the image (file name, width, and height).
     * @return a string representation of the image
     */
    public String toString(){
       if (image == null)
           return null;
       else
           return "IMAGE\n" + 
                  "File name: " + fileName + "\n" +
                  "Width: " + getWidth() + "\n" +
                  "Height: " + getHeight();
    }

    /**
     * Returns an iterator on the image.
     * @return an Iterator on the image
     */
    public Iterator<Pixel> iterator(){
        return new ImageIterator();
    }

    /**
     * Saves the image under its current file name or runs <code>saveAs</code> if no file name yet.
     */
    public boolean save(){
        if (fileName.equals("")) 
            return saveAs();
        try{
            int w = image.getWidth(APImage.this);
            int h = image.getHeight(APImage.this);
            int[] pix = pixelsToInts(pixels);
            BufferedImage buffer = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            buffer.setRGB(0, 0, w, h, pix, 0, w);
            File file = new File(fileName);
            ImageIO.write(buffer, "jpg", file);
        }catch(Exception e){
            System.err.println(e);
            return false;
        }
        return true;
    }

    /**
     * Saves the image using a file dialog.
     * @return true if the save is successful, or false if the user cancels
     */
    public boolean saveAs(){
        File file = saveFileDialog();
        if (file == null)
            return false;
        fileName = file.getName();
        setTitle(fileName);
        return save();
    }

    // Sets the image window's attributes
    private void setWindowAttributes(){
        setTitle(fileName);
        //setResizable(false);
        imagePanel = new ImagePanel(image, 
                                    image.getWidth(this), 
                                    image.getHeight(this));
        Container c = getContentPane();
        c.setBackground(Color.white);
        c.add(imagePanel);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
    private void updateImage(){
        int w = image.getWidth(APImage.this);
        int h = image.getHeight(APImage.this);
        image = createImage(new MemoryImageSource(w, h, pixelsToInts(pixels), 0, w));
        imagePanel.setImage(image, w, h);
    }

    // Maps the image into the array of pixels
    private Pixel[] imageToPixels(Image image){
        int w = image.getWidth(this);
        int h = image.getHeight(this);
        int[] pixels = new int[w * h];
        PixelGrabber pg = new PixelGrabber(image, 0, 0, w, h, pixels, 0, w); 
        try{
            pg.grabPixels();
        }catch (InterruptedException e2) {
            System.err.println("Interrupted waiting for pixels!");
            return null;
	}
        if ((pg.getStatus() & ImageObserver.ABORT) != 0) {
            System.err.println("Image fetch aborted or errored");
	    return null;
        }
        return intsToPixels(pixels);
    }

    // Maps an array of int to an array of pixels
    private Pixel[] intsToPixels(int[] pixels){
        Pixel[] pix = new Pixel[pixels.length];
        for (int i = 0; i < pixels.length; i++)
            pix[i] = new Pixel(pixels[i]);
        return pix;
    }

    // Maps an array of pixels to an array of int
    private int[] pixelsToInts(Pixel[] pixels){
        int[] pix = new int[pixels.length];
        for (int i = 0; i < pixels.length; i++)
            pix[i] = pixels[i].getValue();
        return pix;
    }

    // Creates an image of width w and height h with black pixels
    private ImageProducer getBlankImage(int w, int h){
        pixels = new Pixel[w * h];
        for (int i = 0; i < pixels.length; i++)
            pixels[i] = new Pixel(0, 0, 0);
        return new MemoryImageSource(w, h, pixelsToInts(pixels), 0, w);
    }

    // Reads an image from a file and updates the pixels array
    private Image getImageFromFile(String fileName){
        Image image = null;
        try{
            File file = new File(fileName);
            image = ImageIO.read(file);
            while (image.getWidth(APImage.this) < 0)  // Wait for size to be known
                {}
            pixels = imageToPixels(image);
        }catch(Exception e){
            System.out.println(e); 
        }
        return image;
    }
   
    private File openFileDialog(){
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new ImageFileFilter(".jpg", "JPEG images (*.jpg)"));
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.CANCEL_OPTION)
            return null;
        else
            try{
                File file = chooser.getSelectedFile();
                return file;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                                              e.toString());
            }
            return null;
    }

    private File saveFileDialog(){
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new ImageFileFilter(".jpg", "JPEG images (*.jpg)"));
        int result = chooser.showSaveDialog(null);
        if (result == JFileChooser.CANCEL_OPTION)
            return null;
        else
            try{
                File file = chooser.getSelectedFile();
                return file;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                                              e.toString());
            }
            return null;
    }
    
    private class ImageIterator implements Iterator<Pixel>{
        private int pos = 0;
      
        public boolean hasNext(){
            return pos < pixels.length;
        }

        public Pixel next(){
           if (! hasNext())
               throw new NoSuchElementException();
           pos++;
           return pixels[pos - 1];
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }
    }
       
}
      