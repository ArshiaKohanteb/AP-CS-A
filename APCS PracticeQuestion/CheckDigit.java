public class CheckDigit {

    public static boolean isValid(int numWithCheckDigit) {
        int numWithoutCheckDigit = numWithoutCheckDigit % 10;
        String numWithoutCheckDigitString = (Integer.toString(numWithCheckDigit));
        String checkDigitString = numWithoutCheckDigitString.substring(numWithoutCheckDigitString.length - 1);
        int checkNum = Integer.parseInt(checkDigitString);

        if (numWithCheckDigit.getCheck() == checkNum) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int numWithCheckDigit)
    {
        //In order to count the amount of times isValid is called, I would create an integer variable inside the CheckDigit class called 
        // isValidCount and then add one to it everytime isValid is called and then I would create a static accesor method to access the integer.
    }
}

