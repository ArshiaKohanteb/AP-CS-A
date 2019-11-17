// Arshia Kohanteb

import images.APImage;
import images.Pixel;

public class Quiz5 {

   public static void main (String [] args) {

     APImage image = new APImage(400,400);
     
     
       
     for (Pixel p: image){
         p.setRed(255);            
      }
     
     int y = image.getHeight() / 2;
     
     for(int x = 0; x <= image.getWidth(); x++)
     {
     image.setPixel(x, y, new Pixel(0, 255, 0));
     }
     
     int xx = image.getWidth() / 2;
     
     /*for(int yy = image.getHeight(); yy >= 0; yy--)
     {
     image.setPixel(xx, yy ,new Pixel(0, 255, 0));
     }*/
       
     image.draw();
  }
}