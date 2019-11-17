import images.*;

public class CopyToGray{

   public static void main(String[]args){
      APImage image = new APImage("smokey.jpg");
      image.draw();
      APImage aCopy = image.clone();
      for (Pixel p: aCopy){
         int red = p.getRed();
         int green = p.getGreen();
         int blue = p.getBlue();
         int average = (red + green + blue) / 3;
         p.setRed(average);
         p.setGreen(average);
         p.setBlue(average);               
      }
      aCopy.draw();
      aCopy.save();
   }
}
      