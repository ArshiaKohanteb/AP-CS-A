//Bob and Arshia Calculator Program
import java.util.Scanner; //Initialize
public class MainCal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean run = true;

        System.out.println("Welcome to Bob & Arsia's Fancy Calculator Program!");

        while (run) {

            System.out.println("Please enter the first integer: ");
            int First = input.nextInt();

            System.out.println("Please enter the second integer: ");
            int Second = input.nextInt();

            System.out.println("Please enter the operation, choose from the following:");

            System.out.println("-------------------");
            System.out.println("<1> Addition (+)");
            System.out.println("<2> Subtraction (-) ");
            System.out.println("<3> Multiplication (x) ");
            System.out.println("<4> Division (/) ");
            System.out.println("What's your choice?");
            System.out.println("-------------------");
            int choice = input.nextInt();


            if (choice == 1) {
                System.out.println(First + " + " + Second + " = " + (First + Second));
            } else if (choice == 2) {
                System.out.println(First + " - " + Second + " = " + (First - Second));
            } else if (choice == 3) {
                System.out.println(First + " x " + Second + " = " + (First * Second));
            } else if (choice == 4) {
                System.out.println(First + " / " + Second + " = " + (First / Second));
            } else if (choice > 4) {
                System.out.println("You are typing wrong numbers!Start again to make correct choice");
            }

            System.out.println("Would you like to use Arshia and Bob's Calculator Program?");
            System.out.println("Choose 1 for yes and 2 for no.");
            System.out.println("What is your choice? ");

            int use = input.nextInt();
            if (use == 1) {
                run = true;
            } else {
                run = false;
                System.out.println("Thanks for playing! Please run again when you need more calculations!");
            }
        }
    }
}