//***********************************
//   Number Counter.java    @ArshiaKo
//
//   Number Counter Programming Lab
//***********************************

import java.util.Scanner;

public class NumberCounter {  
  public static void main (String [] args) {
    
    Scanner reader = new Scanner(System.in);
    
    int[] array = new int[19];
    
    for(int i = 0; i < array.length;i++)
    {
      System.out.println("Please enter variable number " + i);
      array[i] = reader.nextInt();
    }
  
    
  }
}


    