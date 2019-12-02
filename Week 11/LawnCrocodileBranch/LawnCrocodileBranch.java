//***********************************
//   LawnCrocodileBranch.java     @ArshiaKo
//
//   LawnCrocodileBranch
//***********************************

import java.util.Scanner;
import java.util.Random;

public class LawnCrocodileBranch {  
  public static void main (String [] args) {
    
    //VARIABLES
    Random rand = new Random();
    Scanner reader = new Scanner(System.in);
    boolean run = true;
    String guess = "";
    int computer = 0;
    int win = 0, loss = 0, tie = 0;

    
    
    System.out.println("Welcome to Lawn Mower, Crocodile, Branch");
    //CONTINOUS WHILE LOOP THAT BREAKS WHEN USER DOESNT WANT TO PLAY ANYMORE
    while(run)
    {
      System.out.println("Please select:  Lawn Mower, Crocodile, or Branch");
      guess = reader.nextLine();
      computer = rand.nextInt(3);
      
      //if(branch) then what did computer say and what is output?
      
      if(guess.equals("branch"))
      {
        if(computer == 0)
        {
          System.out.println("You selected " + guess + ".  The computer chose Lawn Mower. You Win! ");
          win++;
        }
        else if(computer == 1)
        {
          System.out.println("You selected " + guess + ".  The computer chose Crocodile. You Lose :( ");
          loss++;
        }
        else if(computer == 2)
        {
          System.out.println("You selected " + guess + ".  The computer chose Branch. It's a tie! ");
          tie++;
        }
      }
      
      //if(lawn mower) then what did computer say and what is output?
      
      else if(guess.equals("lawn mower"))
      {
        if(computer == 0)
        {
          System.out.println("You selected " + guess + ".  The computer chose Lawn Mower. It's a Tie! ");
          tie++;
        }
        else if(computer == 1)
        {
          System.out.println("You selected " + guess + ".  The computer chose Crocodile. You Win! ");
          win++;
        }
        else if(computer == 2)
        {
          System.out.println("You selected " + guess + ".  The computer chose Branch. You Lose :( ");
          loss++;
        }
      }
      
      //if(crocodile) then what did computer say and what is output?
      
      else if(guess.equals("crocodile"))
      {
        if(computer == 0)
        {
          System.out.println("You selected " + guess + ".  The computer chose Lawn Mower. You Lose :( ");
          loss++;
        }
        else if(computer == 1)
        {
          System.out.println("You selected " + guess + ".  The computer chose Crocodile. It's a tie! ");
          tie++;
        }
        else if(computer == 2)
        {
          System.out.println("You selected " + guess + ".  The computer chose Branch. You Win! ");
          win++;
        }
      }
      
      //making sure answer is either Lawn Mower Crocodile or Branch
      else
      {
      System.out.println("Please enter a valid answer!");
      }
      
      System.out.println("");
      System.out.println("You have " + win + " wins, " + loss + " losses, " + tie + " ties.");
      System.out.println("Would you like to play again? (Yes or No)");
      if((reader.nextLine()).equals("no"))
      {
      run = false;
      System.out.println("Thanks For Playing!");
      }
    }
  }
}
    