import javax.swing.*;
import java.awt.*;

public class GUI1
{
 public static void main(String[] args)
 {
   JFrame theGUI = new JFrame();
   theGUI.setTitle("square checker board");
   theGUI.setSize(500,500);
   theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   JPanel panel1 = new JPanel();
   panel1.setBackground(Color.red);
   JPanel panel2 = new JPanel();
   panel2.setBackground(Color.black);
   JPanel panel3 = new JPanel();
   panel3.setBackground(Color.blue);
   JPanel panel4 = new JPanel();
   panel4.setBackground(Color.green);
   JPanel panel5 = new JPanel();
   panel5.setBackground(Color.yellow);
   JPanel panel6 = new JPanel();
   panel6.setBackground(Color.red);
   JPanel panel7 = new JPanel();
   panel7.setBackground(Color.black);
   JPanel panel8 = new JPanel();
   panel8.setBackground(Color.blue);
   JPanel panel9 = new JPanel();
   panel9.setBackground(Color.green);
   JPanel panel10 = new JPanel();
   panel10.setBackground(Color.yellow);
   JPanel panel11 = new JPanel();
   panel11.setBackground(Color.blue);
   JPanel panel12 = new JPanel();
   panel12.setBackground(Color.red);
   JPanel panel13 = new JPanel();
   panel13.setBackground(Color.black);
   JPanel panel14 = new JPanel();
   panel14.setBackground(Color.blue);
   JPanel panel15 = new JPanel();
   panel15.setBackground(Color.green);
   JPanel panel16 = new JPanel();
   panel16.setBackground(Color.yellow);
   
   Container pane = theGUI.getContentPane();
   pane.setLayout(new GridLayout(4,4));
   pane.add(panel1);
   pane.add(panel2);
   pane.add(panel3);
   pane.add(panel4);
   pane.add(panel5);
   pane.add(panel6);
   pane.add(panel7);
   pane.add(panel8);
   pane.add(panel9);
   pane.add(panel10);
   pane.add(panel11);
   pane.add(panel12);
   pane.add(panel13);
   pane.add(panel14);
   pane.add(panel15);
   pane.add(panel16);
   
   
   theGUI.setVisible(true);
 }
}
