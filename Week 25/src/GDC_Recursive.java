import java.util.Scanner;

// Java program to find GCD of two numbers 
public class GDC_Recursive 
{ 
    // Recursive function to return gcd of a and b 
    static int gcd(int a, int b) 
    {  
        if (a == 0) 
        {
          return b; 
        }
        
        else if (b == 0) 
        {
          return a; 
        }
       
        else if (a == b) 
        {
            return a;
        }
       
        else if (a > b) 
        {
        return gcd(a-b, b); 
        }
        
        else
        {
        return gcd(a, b-a); 
        }
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
    	Scanner in = new Scanner(System.in);
    	System.out.println("A is: "); 
        int a = in.nextInt();
        System.out.println("B is: "); 
        int b = in.nextInt(); 
        
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b)); 
    } 
} 