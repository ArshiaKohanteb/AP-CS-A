import TurtleGraphics.*;
import java.awt.Color;

public class TestPens
{
  public static void main (String [] args)
  {
    
    //3 pen vars
    Pen p1, p2, p3;
    
    //instantiate the different types
    p1 = new StandardPen();
    p2 = new WigglePen();
    p3 = new RainbowPen();
    
   /* 
    //draw a square - Standard pen
    for (int i = 1; i <= 4; i++)
    {
      p1.move(50);
      p1.turn(90);
    }
    
     //draw a square - Wiggle pen
     for (int i = 1; i <= 4; i++)
    {
      p2.move(50);
      p2.turn(90);
    }
     
      //draw a square - Rainbow pen
      for (int i = 1; i <= 4; i++)
    {
      p3.move(50);
      p3.turn(90);
    }
  */
    drawSquare(p1);
    drawSquare(p2);
    drawSquare(p3);
    
    
  }
  
  
  //use interface name as the parameter type!!
   static private void drawSquare(Pen p)
  {
     for (int i = 1; i <= 4; i++)
    {
      p.move(50);
      p.turn(90);
    }
  }
  
}
    