//***********************************
//   triangle.java         @ArshiaKo
//
//       Triangle Classifier
//***********************************

import java.util.Scanner;

public class Triangle{
  public static void main(String[] args) {
   
   Scanner reader = new Scanner(System.in);
   
   System.out.println("Welcome to Triangle Classifier!");
   System.out.println("Enter the 3 side lengths:");
  
  int a = reader.nextInt();
  int b = reader.nextInt();
  int c = reader.nextInt();
  
  int A = a * a; //A = a squared
  int B = b * b; //B = b squared
  int C = c * c; //C = c squared
  
  if(A + B > C)
  {
  System.out.println("Your triangle is a acute triangle!");
  }
  
  if(A + B < C)
  {
  System.out.println("Your triangle is a obtuse triangle!");
  }
  
  if(A + B == C)
  {
  System.out.println("Your triangle is a right triangle!");
  }
  
 }
}