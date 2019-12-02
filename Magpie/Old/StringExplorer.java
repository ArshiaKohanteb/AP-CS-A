/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

 public static void main(String[] args)
 {
  String sample = "The quick brown fox jumped over the lazy dog.";
  
  //  Demonstrate the indexOf method.
  int position = sample.indexOf("fox");
  System.out.println ("sample.indexOf(\"quick\") = " + position);

  //TEST to see what happens if strin gis not recognized
    int pos = sample.indexOf("hi");
  System.out.println ("sample.indexOf(\"hi\") = " + pos);
  
    //TEST to see what diffeernt constructors do
    int psn = sample.indexOf("the", 14);
  System.out.println ("sample.indexOf(\"the\") = " + psn);//It skipped the first "the"
    
  //  Demonstrate the toLowerCase method.
  String lowerCase = sample.toLowerCase();
  System.out.println ("sample.toLowerCase() = " + lowerCase);
  System.out.println ("After toLowerCase(), sample = " + sample);
  
  //  Try other methods here:

 }

}
