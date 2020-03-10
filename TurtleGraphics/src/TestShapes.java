import TurtleGraphics.*;
import java.awt.Color;

public class TestShapes
{
  public static void main (String [] args)
  {
    Pen p = new StandardPen();
    
    Shape s1 = new Circle(20,20,10);
    
    Shape s2 = new Wheel(-20,-20,20,6);
    
    Shape s3 = new Rect(-40,40,10,20);
    
    s1.draw(p);
    s2.draw(p);
    s3.draw(p);
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    
    System.out.println(s1.perimiter());
    
  }
}