import images.*;
import java.util.Scanner;

public class Negative{

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
         
         int realR = 255 - red;
         int realG = 255 - green;
         int realB = 255 - blue; 
           
         p.setRed(realR);
         p.setGreen(realG);
         p.setBlue(realB);               
      }
      image.draw();
     
   }
}
      