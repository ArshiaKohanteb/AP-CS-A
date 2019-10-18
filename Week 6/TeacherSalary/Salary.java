//***********************************
//   Salary.java         @ArshiaKo
//
//   Teacher Salary ScreenCast
//***********************************
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Inititalizing Scanner

        System.out.println("Please enter the starting salary:");//Asking for Starting Salary
        double startSalary = input.nextDouble();//Collecting the data for Starting Salary

        System.out.println("Please enter the percentage increase:");//Asking for Percentage Increase
        double percentIncrease = input.nextDouble();//Collecting the data for Percentage Increase

        System.out.println("Please enter the number of years you would like:");//Asking for years of Experience
        double experience = input.nextDouble();//Collecting the data for years of Experience

        System.out.println("Year     Salary");

        double newSalary = startSalary; //Declaring newSalary and making equal to startSalary

        for (int i = 0; i < experience; i++) 
        {
            if (i != 0) 
            {
                newSalary = (newSalary + (percentIncrease / 100) * newSalary);
            }
            
            System.out.println(" " + (i + 1) + "     " + newSalary);
        }
    }
}


         /* Correct Result for input: 40,000, 3, 4
         * 
         * Year       Salary
         * 
         * 1          40000.0
         *
         * 2          41200.0   
         *
         * 3          42436.0
         *
         * 4          43709.08
         * 
         */ 