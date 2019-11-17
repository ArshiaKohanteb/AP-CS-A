//WEEK 9 Q2 NOTES
/*Max Holschneider did the Cat and dog part
Arshia did the  Ms. Murakami part
We did the questions together
we talked about it at the beginning of the week to organize the work
we figured it would be easiest, and we would learn the most if each of us did a method
*/

//WEEK 10 Q2 NOTES
/*
 Arshia Kohanteb added the noncommittal responses and added a couple of keywords like apple and banana
 Max Holschneider added the trim to validate responses and added keywords like school and college
 We found it best to communicate using facetime and text occasionally emailing. 
 Also inbox built into Canvas is very useful for communication.
 We decided it would be best if we noncommittal responses and the keywords between the 2 of us
 */

import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2 {

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args) {
        Magpie2 maggie = new Magpie2();

        System.out.println(maggie.getGreeting());
        Scanner in = new Scanner(System.in);
        String statement = in .nextLine();

        while (!statement.equals("Bye")) {
            System.out.println(maggie.getResponse(statement));
            statement = in .nextLine();
        }
        System.out.println("NOOOO DON'T LEAAAVE...");
    }

}