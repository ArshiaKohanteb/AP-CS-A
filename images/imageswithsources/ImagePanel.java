package images;

import java.awt.*;
import javax.swing.*;

/**
 * LICENSE: This is open-source software released under the terms of the<BR>
 * GPL (http://www.gnu.org/licenses/gpl.html).<BR><BR>
 * 
 * This class implements a panel for displaying an image.
 */
public class ImagePanel extends JPanel{

    private Image image;

    /**
     * Creates an ImagePanel.
     * @param image the image to be displayed
     * @param width the width of <code>image</code>
     * @param height the height of <code>image</code>
     */
    public ImagePanel(Image image, int width, int height){
        setBackground(Color.white);
        this.image = image;
        setPreferredSize(new Dimension(width, height));
    }

    /**
     * Draws the image in the panel if the image is not null.
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (image != null)
            g.drawImage(image, 0, 0, Color.white, this);
    }

    /**
     * Resets the image and redraws it in the panel.
     * @param image the image to be displayed
     */
    public void setImage(Image image, int width, int height){
        this.image = image;
        setPreferredSize(new Dimension(width, height));
        repaint();
    }
}
      