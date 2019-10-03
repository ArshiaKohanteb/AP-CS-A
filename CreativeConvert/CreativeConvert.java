//***********************************
//   CreativeConvert.java      @ArshiaKo
//
//    Converting Inches to Meters
//***********************************

import java.util.Scanner;

public class CreativeConvert {  
  public static void main (String [] args) {
    
    //declaring type Double name inch
    double inch;
   
    //created scanner object
    Scanner reader = new Scanner(System.in);
   
    
    System.out.println("Inch to Meter Converter");
    
    //print Input inches before asking for number
    System.out.print("Input Inches:");
    
    //ask the user for inches to convert
    inch = reader.nextDouble();
    
    //print Meters: before the answer
    System.out.print("Meters:");
    
    //Formula for Inches to Meter is x * 0.0254
    System.out.println(inch * 0.0254);
    
 
  }
}
     