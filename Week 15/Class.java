//Class called Class that stores litteral classes - Arshia Kohanteb

public class Class
{
  //instance variables
  private String Name;
  private int Assignments;
  private int Expected;
  
  public Class(int assignments, int expected)
  {
    Assignments = assignments;
    Expected = expected;
  }
 
  public void setAssignments(int assignments) 
  {  
    Assignments = assignments;
  } 
  
  public void setExpected(int expected) 
  {  
    Expected = expected;
  }  
  
  public int getAssignments() 
  {  
        return Assignments;
  }
  
  public int getExpected() 
  {  
        return Expected;
  }

  public void printInfo()
  {
        System.out.println("Name: " + Name + "\n# of Assignments: " + Assignments + "\nExpected time for Completion: " + Expected );
  }
  
}
