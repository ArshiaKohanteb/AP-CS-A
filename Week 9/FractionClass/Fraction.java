//FractionClass Class - Arshia Kohanteb

public class Fraction
{
  //instance variables
  private int numerator;
  private int denominator;
  
  //constructor
  public Fraction(int numer, int denom)
  {
    numerator = numer;
    denominator = denom;
  }

  // Get - Accessor
  public int getNumerator() 
  {  
    return numerator;
  }
  
    // Get - Accessor
  public int getDenominator() 
  {  
    return denominator;
  }
  
  public Fraction add(Fraction frac)
  { 
    int leftNum, leftDenom, rightNum, rightDenom, newNum, newDenom;
    
    leftNum = this.numerator;
    leftDenom = this.denominator;
    
    rightNum = frac.getNumerator();
    rightDenom = frac.getDenominator();
    
    newNum = leftNum*rightDenom + rightNum*leftDenom;
    newDenom = leftDenom * rightDenom;
    
    Fraction sum = new Fraction(newNum, newDenom);
    
    return sum;
    
  }
 
  public Fraction multiply(Fraction frac)
  { 
    int leftNum, leftDenom, rightNum, rightDenom, newNum, newDenom;
    
    leftNum = this.numerator;
    leftDenom = this.denominator;
    
    rightNum = frac.getNumerator();
    rightDenom = frac.getDenominator();
    
    newNum = leftNum*rightNum;
    newDenom = leftDenom*rightDenom;
    
    Fraction sum = new Fraction(newNum, newDenom);
    
    return sum;
    
  }
  
  public Fraction subtract(Fraction frac)
  { 
    int leftNum, leftDenom, rightNum, rightDenom, newNum, newDenom;
    
    leftNum = this.numerator;
    leftDenom = this.denominator;
    
    rightNum = frac.getNumerator();
    rightDenom = frac.getDenominator();
    
    newNum = leftNum*rightDenom - rightNum*leftDenom;
    newDenom = leftDenom * rightDenom;
    
    Fraction sum = new Fraction(newNum, newDenom);
    
    return sum;
    
  }
  
  public Fraction divide(Fraction frac)
  { 
    int leftNum, leftDenom, rightNum, rightDenom, newNum, newDenom;
    
    leftNum = this.numerator;
    leftDenom = this.denominator;
    
    rightNum = frac.getNumerator();
    rightDenom = frac.getDenominator();
    
    newNum = leftNum/rightDenom;
    newDenom = rightNum/leftDenom;
    
    Fraction sum = new Fraction(newNum, newDenom);
    
    return sum;
    
  }
  
    //Print - Accessor
  public void print()
    {
        System.out.println(numerator + "/" +  denominator);
    }
    
  
}
