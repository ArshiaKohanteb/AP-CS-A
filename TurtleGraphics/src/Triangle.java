import TurtleGraphics.Pen;

public class Triangle implements Shape
{
  private double x1, y1, x2, y2, x3, y3;
  
  public Triangle()
  {
    x1 = 0;
    y1 = 0;
    x2 = 0;
    y2 = 0;
    x3 = 0;
    y3 = 0;
  }
  
  public Triangle(double X1, double Y1, double X2, double Y2, double X3, double Y3)
  {
	  x1 = X1;
	  y1 = Y1;
	  x2 = X2;
	  y2 = Y2;
	  x3 = X3;
	  y3 = Y3;
  }
  
  public double area()
  {
	  return (Math.abs(x1*y2-x2*y1+x2*y3-x3*y2+x3*y1-x1*y3))/2.0;
  }
  
  public void draw(Pen p)
  {
    p.up();
    p.move (x1, y1);
    p.down();
    p.setDirection(0); 
    p.move(x2,y2);
    p.move(x3,y3);
  }
  
  public double getXPos()
  {
    return x1;
  }
  
  public double getYPos()
  {
    return y1;
  }
  
  public void move(double xLoc, double yLoc)
  {
	  x1 = x1 + xLoc;
      y1 = y1 + yLoc;
      x2 = x2 + xLoc;
      y2 = y2 + yLoc;
      x3 = x3 + xLoc;
      y3 = y3 + yLoc;
  }
  
  public void stretchBy(double factor)
  {
    x1 *= factor;
    y1 *= factor;
  }
  
  public String toString()
  {
    String str = "Triangle\n"
      //+ "Width and Height: " + width +" & " + height+ "\n"
      + "(X,Y) Position: (" + x1 + ", "+ x2 + ")\n"
      + "Area: " +  area();
    return str;
  }
  
  //I couldnt figure out how to calculate the perimiter using x and y cordiantes becuase you would have to use distance and add them all up but I couldnt figure out the distance
  // I was looking into other options like using the point class to use the distance() function for coordinates but I figured since we didnt learn it thats probobly not the right way
  public double perimiter()
  {
	  return null;
  }
  
}
            