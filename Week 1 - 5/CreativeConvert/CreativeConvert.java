//***********************************
//   CreativeConvert.java      @ArshiaKo
//
//    Converting Inches to Meters
//    Implemening JOptionPane
//***********************************

import javax.swing.JOptionPane;

public class CreativeConvert {  
  public static void main (String [] args) {
    
    //declaring type Double name inch
    double inch;
    double meters;
   
    //created scanner object
    String inputStr = JOptionPane.showInputDialog("Enter Inches", "0");
    if(inputStr == null)
    {
      return;
    }
    
    inch = Double.parseDouble(inputStr);
    meters = inch * 0.0254;
   
    if(inch < 0)
    {
    JOptionPane.showMessageDialog(null, "Error: Inches must be greater or equal to 0!");
    }
    else{
    //Formula for Inches to Meter is x * 0.0254
    JOptionPane.showMessageDialog(null, inch + " inches is equivelant to " + meters + " meters.");
    }
    
 
  }
}
     