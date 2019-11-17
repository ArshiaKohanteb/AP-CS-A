/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * 
 *       Uses indexOf to find strings
 * 
 *       Handles responding to simple words and phrases 
 *
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
    /**
     * Get a default greeting  
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";

        if ((statement.trim()).length() > 0) {
          
            if (statement.indexOf("no") >= 0) 
            {
                response = "Why so negative?";
            } 
            
            else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0 || statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0) 
            {
                response = "Tell me more about your family.";
            } 
            
            else if (statement.indexOf("school") >= 0 || statement.indexOf("college") >= 0) 
            {
                //Max Holschneider
                response = "Tell me more about your School.";
            } 
            
            else if (statement.indexOf("joke") >= 0 || statement.indexOf("laugh") >= 0) 
            {
                //Arshia Kohanteb
                response = "Did you hear about the mathematician whoÕs afraid of negative numbers? \nHeÕll stop at nothing to avoid them.";
            } 
            
            
            else if (statement.indexOf("real") >= 0 || statement.indexOf("human") >= 0 || statement.indexOf("bot") >= 0) 
            {
                //Arshia Kohanteb
                response = "if(f(x) == y) \n{\nI'm a bot\n}";
            } 
            
            else if (statement.indexOf("Ms. Murakami") >= 0) 
            {
                response = "She seems like a great teacher ";
            } 
            
            else 
            {
                response = getRandomResponse();
            }
            
            return response;
        } 
        else 
        {
            return "Please say something!";
        }
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) 
        {
            response = "Interesting, tell me more.";
        } 
        else if (whichResponse == 1) 
        {
            response = "Hmmm.";
        } 
        else if (whichResponse == 2) 
        {
            response = "Do you really think so?";
        } 
        else if (whichResponse == 3) 
        {
            response = "You don't say.";
        }
        //Max Holschneider
        else if (whichResponse == 4) 
        {
            response = "Really.";
        }
        //Max Holschneider
        else if (whichResponse == 5) 
        {
            response = "Wow!";
        }

        return response;
    }
}