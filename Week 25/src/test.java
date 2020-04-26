import java.util.*;


public class test{

     public static void main(String []args){
    	 
    	 mystery(2015);
    	 
     }
     
     public static void mystery(int x)
     {
        System.out.print(x % 10);
        if ((x / 10) != 0)
        {
           mystery(x / 10);
        }
        System.out.print(x % 10);
     }
    }