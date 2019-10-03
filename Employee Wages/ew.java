//***********************************
//   ew.java         @ArshiaKo
//
//   Employee Wage
//***********************************

import java.util.Scanner;

public class ew {  
  public static void main (String [] args) {
    
    
    Scanner reader = new Scanner(System.in);
   
    System.out.print("Enter the hourly wage: ");
    
    Double wage = reader.nextDouble();
    
    System.out.print("Enter the total regular hours: ");
    
    Double regular = reader.nextDouble();
    
    System.out.print("Enter the overtime hours: ");
    
    Double ot = reader.nextDouble(); //ot stands for overtime
   
    
    System.out.println("The weekly pay for the employee is: $" + ((wage * regular) + (ot * (wage * 1.5))));
    
  }
}
    