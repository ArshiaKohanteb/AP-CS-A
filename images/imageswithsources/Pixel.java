package images;

/**
 * This class represents a pixel that contains an RGB value.
 */

public class Pixel{

    private int alpha = 255, red = 0, green = 0, blue = 0;

    /**
     * LICENSE: This is open-source software released under the terms of the<BR>
     * GPL (http://www.gnu.org/licenses/gpl.html).<BR><BR>
     zz8
     * Creates a Pixel from an integer value.
     * @param i the integer value
     */
    public Pixel(int i){
        setValue(i);
    }

    /**
     * Creates a Pixel from RGB values and an Alpa value.
     * @param r the red value
     * @param g the green value
     * @param b the blue value
     * @param a the Alpha value
     */
    private Pixel(int r, int g, int b, int a){
        red = r;
        green = g;
        blue = b;
        alpha = a;
    }

    /**
     * Creates a Pixel from RGB values.
     * @param r the red value
     * @param g the green value
     * @param b the blue value
     */
    public Pixel(int r, int g, int b){
        this(r, g, b, 255);
    }

    /**
     * Creates a new Pixel from p.
     * @param p the red value
     */
    private Pixel(Pixel p){
        this(p.getRed(), p.getGreen(), p.getBlue(), p.getAlpha());
    }

    /**
     * Resets the pixel to an integer value.
     * @param i the integer value
     */
    private void setValue(int pixel){
        alpha = (pixel >> 24) & 0xff;
        red   = (pixel >> 16) & 0xff;
        green = (pixel >>  8) & 0xff;
        blue  = (pixel      ) & 0xff;
    }

    /**
     * Returns the integer value of the pixel.
     * @return the pixel's integer value
     */
    public int getValue(){
        return (alpha << 24) | (red << 16) | (green << 8) | blue;
    }

    /**
     * Returns the red value of the pixel.
     * @return the pixel's red value
     */
    public int getRed(){
        return red;
    }

    /**
     * Returns the green value of the pixel.
     * @return the pixel's green value
     */
    public int getGreen(){
        return green;
    }

    /**
     * Returns the blue value of the pixel.
     * @return the pixel's blue value
     */
    public int getBlue(){
        return blue;
    }

    /**
     * Returns the Alpha value of the pixel.
     * @return the pixel's Alpha value
     */
    private int getAlpha(){
        return alpha;
    }

    /**
     * Resets the pixel's red value.
     * @param r the red value
     */
    public void setRed(int r){
        red = r;
    }

    /**
     * Resets the pixel's green value.
     * @param g the green value
     */
    public void setGreen(int g){
        green = g;
    }

    /**
     * Resets the pixel's blue value.
     * @param b the blue value
     */
    public void setBlue(int b){
        blue = b;
    }

    /**
     * Resets the pixel's Alpha value.
     * @param a the Alpha value
     */
    private void setAlpha(int a){
        alpha = a;
    }

    /**
     * Returns a copy of the pixel.
     * @return Pixel representing a copy of this pixel
     */
    public Pixel clone(){
        return new Pixel(this);
    }

    /**
     * Returns the string representation of the of the pixel.
     * @return a string containing the RGB values
     */
    public String toString(){
        return "Pixel R: " + red + " G: " + green + " B: " + 
               blue;
    }

}