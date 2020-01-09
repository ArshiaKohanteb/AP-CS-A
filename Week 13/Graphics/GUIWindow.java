// Main application window for Chapter 3 graphics examples
import javax.swing.*;
import java.awt.*;

public class GUIWindow { 
  public static void main(String[] args){
    
    //GUI
    JFrame theGUI = new JFrame();
    theGUI.setTitle("GUI Program");
    theGUI.setSize(400, 200);
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ColorPanel panel= new ColorPanel(Color.black);
    Container pane= theGUI.getContentPane();
    pane.add(panel); 
    theGUI.setVisible(true); 
  }
}