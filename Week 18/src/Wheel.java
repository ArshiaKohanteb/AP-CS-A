import TurtleGraphics.Pen;


//extends circle = subclass of Circle and gets all of Circle's vars and methods
public class Wheel extends Circle
{
  //need to change Circle vars to be protected for Wheel to access them
  private int spokes;
  
  public Wheel()
  {
    //use super to activate the constructor in the super class (Circle)
    super();
    spokes = 0;
  }
  
  public Wheel(double xLoc, double yLoc, double r, int s)
  {
    super(xLoc,yLoc,r);
    spokes = s;
  }
   
  public void draw(Pen p)
  {
    //use super to do the draw from the super class then make the spokes...
    super.draw(p);
    
    for (int i = 1; i<=spokes; i++)
    {
      p.up();
      p.move(xPos,yPos);
      p.setDirection(i*360.0 / spokes);
      p.down();
      p.move(radius);
    }
  }
  
  public void setSpokes(int s)
  {
    spokes = s;
  }

  public String toString()
  {
    String str = "WHEEL\n"
      + "Radius: " + radius + "\n"
      + "Spokes: " + spokes + "\n"
      + "(X,Y) Position: (" + xPos + ", "+ yPos + ")\n"
      + "Area: " +  area();
    return str;
  }
  
  //not all methods in Circle are defined here - they don't need to be if there is no change...
  //extra methods possible - setSpokes
  
}
            