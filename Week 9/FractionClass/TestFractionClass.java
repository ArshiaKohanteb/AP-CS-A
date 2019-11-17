public class TestFractionClass
{
  public static void main (String args[])
  {
    Fraction frac1 = new Fraction(1,2);
    Fraction frac2 = new Fraction(3,4);
    
    Fraction sum = frac1.add(frac2);
    Fraction product = frac1.multiply(frac2);
    Fraction difference = frac1.subtract(frac2);
    Fraction quotient = frac1.divide(frac2);
    
    quotient.print();
  }
}