import java.util.Scanner;
import java.util.*;

public class ArrayListPrograms{
  
  public static void main(String [] args) {         
    //user interacts with program
    Scanner reader = new Scanner(System.in);
    
    //declare and instantiate arraylist
    List<String> list = new ArrayList<String>(); //declare list out here so that all methods can use it
    
    
     /********METHOD 1 - called inputStrings ***********/
    //runs inputStrings method - user enters in the number of strings/names
    inputStrings(list);
    
      //prints all of the strings in the new list
    for (String str : list)   
      System.out.println(str);
    
     /********METHOD 2 - called sortStrings ***********/
    //runs sortString method - sorts the list
    sortStrings(list);   
    
    //prints all of the strings in the newly sorted list
    for (String str : list)   
      System.out.println(str);
    
    
    /********METHOD 3 - called sortAndAddStrings ***********/
      //prompt user for another string
    System.out.print("Enter an additional String.");  
    String newString = reader.next();
    
    //run sortAndAdd Method - a new String is added and sorted in the list
    sortAndAddStrings(list, newString);   
    
    //Prints all the strings in the list 
    for (String str : list)  
      System.out.println(str);
    
    
    /********METHOD 4 - called removeString **********/
    //prompts user for the string they wish to remove
    System.out.print("Enter in the string you want to remove.");  
    String removeString= reader.next();
    
    //run removeString Method - removes unwanted string
    removeString(list, removeString);      
    
    //Prints all the strings in the list
    for (String str : list)    
      System.out.println(str);
  }
  /***************************************************
    * Completes the three methods
    * 
    * 3/11/16
    * ***********************************************/

  //Method #1: Adds the names to the list
  public static void inputStrings(List<String> list){
    Scanner reader = new Scanner(System.in);
    
    System.out.println("how many names would you like in the list?");
    int num = reader.nextInt();
    String name;
   
    for(int i = 0; i < num; i++)
    {
      System.out.println("Enter name: ");
      name = reader.next();
      list.add(i, name);
    }
    }
  
  //Method #2: puts the list of arays in alphabetical order
  public static void sortStrings(List<String> inList){
    String placeHolder;
    for(int i = 0; i < inList.size()-1; i++)
    {
      for(int x = i + 1; x < inList.size(); x++)
      {
        if(inList.get(i).compareTo(inList.get(x)) > 0)
        {
          placeHolder = inList.get(i);
          inList.set(i, inList.get(x));
          inList.set(x, placeHolder);
          
        }
    }
  }
  }
  
  //Method #3: adds a string and resorts the list 
  public static void sortAndAddStrings(List<String> inList, String insert){
    inList.add(insert);
    sortStrings(inList);
    
  }
  
  //Method #4: removes a specified string from the list
  public static void removeString(List<String> inList, String removed)
  {
    for(int i=0; i < inList.size()-1; i++){
        inList.remove(removed);
    }
  }
}