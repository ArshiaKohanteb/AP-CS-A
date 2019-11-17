import images.*;
import java.util.Scanner;

public class ColorFilter{

   public static void main(String[]args){
     
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please input file Name (Case Sensative including extension):");
      String file = input.nextLine();
      
      System.out.println("R:");
      int R = input.nextInt();
      
      System.out.println("G:");
      int G = input.nextInt();
      
      System.out.println("B:");
      int B = input.nextInt();
     
      APImage image = new APImage(file);
      image.draw();
      
      
      for (Pixel p: image){
         int red = p.getRed();
         int green = p.getGreen();
         int blue = p.getBlue();
         
         int realR = red + R;
         int realG = green + G;
         int realB = blue + B;
         
         if(realR < 0)
         {
         realR = 0;
         }
         if(realR > 255)
         {
         realR = 255;
         }
         
         if(realG < 0)
         {
         realG = 0;
         }
         if(realG > 255)
         {
         realG = 255;
         }
         
         if(realB < 0)
         {
         realB = 0;
         }
         if(realB > 255)
         {
         realB = 255;
         }
         
         p.setRed(realR);
         p.setGreen(realG);
         p.setBlue(realB);               
      }
      image.draw();
     
   }
}
      