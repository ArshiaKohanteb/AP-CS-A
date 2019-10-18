//***********************************
//            @ArshiaKo
//
//Raised to the Power Programming Lab
//
//In theorie you could use math.pow to make this program
//much simpler but this is good loop and efficienct practice
//***********************************

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Raised {  
  public static void main (String [] args) {
  
    Scanner reader = new Scanner(System.in);
   
    int base, exponent, total = 1;
    
    System.out.println("Please enter the base");
    base = reader.nextInt();
    
    System.out.println("Please enter the exponent");
    exponent = reader.nextInt();
    
    for(int i = 0;i < exponent;i++)
    {
    total *= base;
    }
    
    System.out.println(total);
    JOptionPane.showMessageDialog(null, base + " to the power of " + exponent + " = " + total);
  }
}
    