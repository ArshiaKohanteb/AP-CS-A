import images.*;
import java.util.Scanner;

public class Sepia{

   public static void main(String[]args){
     
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please input file Name (Case Sensative including extension):");
      String file = input.nextLine();
      
      APImage image = new APImage(file);
      image.draw();
     
      for (Pixel p: image){
         int red = p.getRed();
         int green = p.getGreen();
         int blue = p.getBlue();
         
         int grayR = 255 - red, grayG = 255 - green, grayB = 255 - blue;
         int realR = 0, realG = 0, realB = 0;
         
         if (grayR < 63) {
           realR = (int)(red * 1.1);
           realB = (int)(blue * 0.9);}
         else if (grayR < 192) {
           realR = (int)(red * 1.1);
           realB = (int)(blue * 0.9);}
         else{
           realR = Math.min((int)(red * 1.08), 255);
           realB = (int)(blue * 0.93);}
           
         p.setRed(realR);
         p.setGreen(realG);
         p.setBlue(realB);               
      }
      image.draw();
     
   }
}
      