//Ms. Asplund
//September 16, 2019

/*This program, when it is working correctly, should prompt

the user for a,b, and c from a quadratic equation

and use those values in the quadratic formula to find the

value(s) of the x intercept.

As it is right now, there are a number of errors...

-at least 3 syntax errors

-at least 1 run time error

-at least 1 logic error

 

You need to fix the errors in my code and explain what it was that I

did wrong...you can do the explanation through comments in the code...but

you probably want to copy into DrJava to help you. 

*/

import java.util.Scanner;

 

public class QuadForm

{ 
 // capital main
  public static void main (String [] args)

  {

    int a,b,c;
    //missing Scanner
    Scanner reader = new Scanner(System.in);
    double x1, x2;

   
//missing a n in println
    System.out.println("This is just a simple class to test your debugging skills :)");

    System.out.println("and your knowledge of the quadratic formula! ");

   

    System.out.print("Enter the value of a: ");
    //double to int
    a = reader.nextInt();

   System.out.print("Enter the value of b: ");

    b = reader.nextInt();

    System.out.println("Enter the value of c: ");

    c = reader.nextInt();

    //order of operations error
    x1 = (-1 * b + Math.sqrt(b*b-4*a*c)) / 2*a;

    x2 = (-1 * b - Math.sqrt(b*b-4*a*c)) / 2*a;

    // you didnt put a + 
    System.out.println("The value of x is " + x1 + " and " +  x2);

  }

}

//FYI - when the program is working correctly, entering a = 1, b = 7, and c = 12,

//should give x = -3.0 and -4.0.