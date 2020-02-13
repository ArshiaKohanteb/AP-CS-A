//***********************************
//NumberCounter.java      @ArshiaKo
//
//  Number Counter Programming Lab
//***********************************

import java.util.Scanner;

public class Mean {  
public static void main (String [] args) {
  
  Scanner reader = new Scanner(System.in);

  double[] initial = new double[10];
  
  for (int i = 0; i < initial.length; i++)
  {
    System.out.println("Please enter variable #" + (i + 1));
    initial[i] = reader.nextDouble();
  }
  
  double averaged = average(initial);
  
  int counter = 0;
  
  for(int i = 0; i < initial.length;i++)
  {
	  if(initial[i] > averaged) 
	  {
		  counter++;
	  }
  }
  
 double[] above = new double[counter]; 
 counter = 0;
 
 for(int i = 0; i < initial.length;i++)
 {
	  if(initial[i] > averaged) 
	  {
		  above[counter] = initial[i];
		  counter++;
	  }
 }
 
  System.out.println(averaged);
  System.out.print("The numbers ");
  
  for(int i = 0; i < above.length;i++)
  {
	  System.out.print(above[i] + ", ");
  }
  System.out.print("are higher than average!");
}

  public static double average(double[] array)
  {
	  double combine = 0;
	  for(int i = 0; i < array.length; i++)
	  {
		  combine += array[i];
	  }
	  
	  return combine / array.length;
  }
  
}
  