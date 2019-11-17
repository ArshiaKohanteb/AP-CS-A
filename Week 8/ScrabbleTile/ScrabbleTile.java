//Scrabble tile Class - Arshia Kohanteb

public class ScrabbleTile
{
  //instance variables
  private String letter;
  private int value;
  
  //constructor
  public ScrabbleTile(String let, int val)
  {
    letter = let;
    value = val;
  }
  
  // Set - Mutator 
  public void setLetter(String let) 
  {  
        letter = let;  
  }  
 
  // Set - Mutator 
  public void setValue(int val) 
  {  
        value = val; 
  }
  
  // Get - Accessor
  public String getLetter() 
  {  
        return letter;
  }
  
  // Get - Accessor
  public int getValue() 
  {  
        return value;
  }
  
  //Print - Accessor
  public void printTile()
    {
        System.out.println("Letter: " + letter + " and Value: " + value );
    }
  
}
