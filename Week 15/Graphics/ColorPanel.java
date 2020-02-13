// Example 3.5: an empty colored panel
import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel{ 
  
  public ColorPanel(Color backColor){ 
    setBackground(backColor); 
  }
  
  public void paintComponent(Graphics g)
  {
    //Quote
  super.paintComponent(g);
  g.setColor(Color.blue);
  Font font = new Font ("Futura", Font.BOLD, 14);
  g.setFont(font);
  g.drawString("The secret of getting ahead is getting started.", 25,50);
  
  //Smiley Face
  g.setColor(Color.yellow);
  g.drawOval(150,75,74,74);
  
  //Eyes
  g.setColor(Color.blue);
  g.drawRect(170,90,10,10);
  g.drawRect(195,90,10,10);
  
  //Smile!
  g.setColor(Color.green);
  g.drawArc(163,90,50,50,180,180);
  
  }
}