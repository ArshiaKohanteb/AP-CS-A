import java.util.Scanner;

//Arshia Kohanteb - Reverse Recurse
public class reverse_recursion 
{ 
	/* Function to print reverse of the passed string */
	void reverserecurse(String str) 
	{ 
		//this is the base case
		if (str.length() <= 1) 
		{
		System.out.println(str); 
		}
		else
		{ 
			System.out.print(str.charAt(str.length()-1)); 
			reverserecurse(str.substring(0,str.length()-1)); 
		} 
	} 
	
	/* Driver program to test above function */
	public static void main(String[] args) 
	{ 
		Scanner reader = new Scanner(System.in);
		System.out.println("String: ");
		String str = reader.nextLine(); 
		reverse_recursion stringobject = new reverse_recursion(); 
		stringobject.reverserecurse(str); 
	}	 
} 
