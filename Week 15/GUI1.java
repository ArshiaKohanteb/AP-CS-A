//Arshia Kohanteb
//January 24, 2020
//AP Computer Science
//A GUI APP OF YOUR OWN DESIGN
//Student Planner

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.util.Scanner;

public class GUI1
{
 public static void main(String[] args)
 {
   //variables
   Scanner input = new Scanner(System.in);
   int assignments;
   int expected;
   int totalAssignments;
   int totalTime;
   int averageTime;
   int ascii = 0;
   
   System.out.println("School Planner:");
     
   //interogation for school name
   System.out.println("Please enter school name:");
   String school = input.nextLine();
     
     //interogation for History class
     System.out.println("Please Enter Amount of Assignments for History:");
     assignments = input.nextInt();
     System.out.println("Expected time to complete average assignment for History (Minutes):");
     expected = input.nextInt();
     Class History = new Class(assignments,expected);
     
     //interogation for Math class
     System.out.println("Please Enter Amount of Assignments for Math:");
     assignments = input.nextInt();
     System.out.println("Expected time to complete average assignment for Math (Minutes):");
     expected = input.nextInt();
     Class Math = new Class(assignments,expected);
     
     //interogation for Science class
     System.out.println("Please Enter Amount of Assignments for Science:");
     assignments = input.nextInt();
     System.out.println("Expected time to complete average assignment for Science (Minutes):");
     expected = input.nextInt();
     Class Science = new Class(assignments,expected);
     
     //calculating total number of assignments
     totalAssignments = History.getAssignments() + Math.getAssignments() + Science.getAssignments();
     //calculating total time to complete assignments
     totalTime = (History.getAssignments()*History.getExpected())  +  (Math.getAssignments()*Math.getExpected())  +  (Science.getAssignments()*Science.getExpected());
     //calculating average time to complete assignments
     averageTime = ((totalTime / 3) / (totalAssignments / 3));
     
     //combonong all ascii values from the string name and turning it into a color for fun!
     for(int i = 0; i < school.length(); i++)
     {
       ascii += school.charAt(i);
     }
     //reducing the value so it can fit into RGB spectrum
     while (ascii > 255)
     {
       ascii /= 2;
     }
     
     
     
     //GUI
   JFrame theGUI = new JFrame("School Planner");
   theGUI.setSize(400,400);
   theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   theGUI.setBackground(new Color(ascii,255-ascii,ascii));
   theGUI.setLayout(new BorderLayout());
   JLabel text = new JLabel("The average time to complete a homework assignment for a class was");
   
     //(total time divided by total classes) divided by (total assignments divided by total classes) > 100
     if ((totalTime / 3) / (totalAssignments / 3) > 100)
     {
       text.setForeground(Color.red); 
     }
     else if ((totalTime / 3) / (totalAssignments / 3) > 50 && (totalTime / 3) / (totalAssignments / 3) < 100)
     {
       text.setForeground(Color.white); 
     }
     else if ((totalTime / 3) / (totalAssignments / 3) < 50)
     {
       text.setForeground(Color.green); 
     }
   theGUI.add(text,JLabel.CENTER);
   theGUI.add(new JLabel(" "+ ascii));
   theGUI.setVisible(true);
   
   Canvas canvas = new Drawing();
   canvas.setSize(400, 400);
   theGUI.add(canvas);
   theGUI.pack();
   
 }
}

