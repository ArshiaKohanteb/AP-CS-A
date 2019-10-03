//***********************************
//   sphere.java         @ArshiaKo
//
//   Sphere calculations
//***********************************

import java.util.Scanner;

public class sphere {  
  public static void main (String [] args) {
    
    Double radius;
    
    Scanner reader = new Scanner(System.in);
   
    System.out.print("What is the radius of your sphere (in inches)?");
    
    radius = reader.nextDouble();
    
    Double diameter = radius * 2;
    
    System.out.println("The diameter of the sphere is: " + diameter + " inches");
    
    System.out.println("The circumfrence of the sphere is: " + (diameter * 3.14) + " inches");
    
    System.out.println("The area of the sphere is: " + (diameter * diameter * 3.14) + " square inches");

    System.out.println("The volume of the sphere is: " + (4 * 3.14 * radius * radius * (radius / 3)) + " cubic inches");
  }
}
    