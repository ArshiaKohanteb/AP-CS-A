//***********************************
//   test.java         @ArshiaKo
//
// Incoming Freshman Data Screencast
//***********************************

import java.util.Scanner;

public class freshman {  
  public static void main (String [] args) {
    
    Scanner reader = new Scanner(System.in);
    
    System.out.println("Please enter your last name:" );
    
    String lastname = reader.nextLine();
    
    System.out.println("Please enter your first name:");
    
    String firstname = reader.nextLine();
    
    System.out.println("Please enter your class year:");
    
    int classyear = reader .nextInt();
    
    System.out.println("Please enter your campus phone:");
    
    int camphone = reader .nextInt(); // camphone = campus phone
    
    System.out.println(firstname + " " + lastname + ", Class of " + classyear + ", phone x" + camphone);

  }
}
    