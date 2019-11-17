//***********************************
//   random.java         @ArshiaKo
//
//             Random AI
//***********************************

import java.util.Scanner;
import java.util.Random;

public class randAI {  
  public static void main (String [] args) {
    
    int guess = 0, count = 0, num = 0, low = 0, high = 101;
  
    Scanner reader = new Scanner(System.in);
    Random rand = new Random();
    
    
    System.out.println("Please enter a number for the computer to guess:");
    num = reader.nextInt();
    
    while(true)
    {
      guess = rand.nextInt(high);
      System.out.println(guess);
      count++;
      
      while(guess <= low)
      {
        guess = rand.nextInt(high);
        if (guess < low)
        {
          low = guess;
        }
      }
      
      if(guess == num)
      {
        System.out.println("PERFECT! You guessed correctly! It took you " + count + " guesses!");
        break;
      }
      
      if(guess > num)
      {
        System.out.println("Too HIGH! Guess again");
        high = guess;
      }
      
      if(guess < num)
      {
        System.out.println("Too LOW! Guess again");
        low = guess;
      }
      
    }
    
    
  }
}
    