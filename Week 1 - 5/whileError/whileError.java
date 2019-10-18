//***********************************
//   whileError.java         @ArshiaKo
//
//   Fixing the While Error
//***********************************

import java.util.Scanner;

public class whileError {  
  public static void main (String [] args) {
    
       int count = 10;

   while (count >= 0)

   {

    System.out.println(count);
    
    //count = count + 1; will count up. Rather use:
    count --;//to count down!
    

   }
    
  }
}
    