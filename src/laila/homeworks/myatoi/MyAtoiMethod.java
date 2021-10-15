package laila.homeworks.myatoi;

public class MyAtoiMethod {

    /**
     * This method converts a string into an integer with positive or negative value
     *
     * @param s - input String
     * @return resultInt - integer
     */
    public static int myAtoi(String s) {

        int resultInt = 0;

        removeLeadingWhiteSpaces(s);

        char[] resultIntegerChar;

        // If the string starts with '+' or '-' the array length matches the string length
        // If not (starts with a digit), the array has an extra space to account for added '+' at the start of the array
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            resultIntegerChar = new char[s.length()];
        } else {
            resultIntegerChar = new char[s.length() + 1];
        }

        // readInAndCheckForNumber
        if (s.charAt(0) == '-') {
            resultIntegerChar[0] = '-';
            for (int i = 1; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    resultIntegerChar[i] = s.charAt(i);
                } else {
                    s = s.substring(0, s.indexOf(s.charAt(i + 1)));
                    resultIntegerChar = s.toCharArray();

                }
            }
        } else if (s.charAt(0) == '+') {
            resultIntegerChar[0] = '+';
            for (int i = 1; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    resultIntegerChar[i] = s.charAt(i);
                } else {
                    s = s.substring(0, s.indexOf(s.charAt(i + 1)));
                    resultIntegerChar = s.toCharArray();

                }
            }
        } else if (Character.isDigit(s.charAt(0))) {
            resultIntegerChar[0] = '+';
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    resultIntegerChar[i + 1] = s.charAt(i);
                } else {
                    s = String.valueOf(resultIntegerChar);
                    s = s.substring(0, s.indexOf(s.charAt(i + 1)));
                    removeZeros(s);
                    resultIntegerChar = s.toCharArray();

                }
            }
        }

        // convertToInteger
        if (Character.isDigit(resultIntegerChar[1])) {
            resultInt = Integer.parseInt(String.valueOf(resultIntegerChar));
        } else {
            resultInt = 0;
        }

        // checkIfIntegerInBounds
        if (resultInt < (int) Math.pow(-2, 31)) {
            resultInt = (int) Math.pow(-2, 31);
        } else if (resultInt > (int) (Math.pow(2, 31) - 1)) {
            resultInt = (int) (Math.pow(-2, 31) - 1);
        }

        // Return the integer as the final result
        return resultInt;
    }

    /**
     * Converts digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0.
     * Changes the sign as necessary.
     *
     * @param s - String
     */
    public static void removeZeros(String s) {
        int number = Integer.parseInt(s);
        s = Integer.toString(number);
    }

    /**
     * Reads in and ignores any leading whitespace.
     *
     * @param s - String
     */
    public static void removeLeadingWhiteSpaces(String s) {
        String regex = "^\\s+";
        s = s.replaceAll(regex, "");
    }

    /**
     * Checks if the next character (if not already at the end of the string) is '-' or '+'.
     * Reads this character in if it is either. This determines if the final result is negative or positive respectively.
     * Assumes the result is positive if neither is present.
     * Reads in next the characters until the next non-digit character or the end of the input is reached.
     * The rest of the string is ignored.
     *
     * @param s                 - String
     * @param resultIntegerChar - char array
     */
    public static void readInAndCheckForNumber(String s, char[] resultIntegerChar) {
    }


    /**
     * If the integer is out of the 32-bit signed integer range [-2(power 31), 2(power 31) - 1], method clamps
     * the integer so that it remains in the range.
     * Specifically, integers less than -2(power 31) are clamped to -2(power 31),
     * and integers greater than 2(power 31) - 1 are clamped to 2(power 31) - 1.
     *
     * @param resultInt - integer
     */
    public static void checkIfIntegerInBounds(int resultInt) {
    }

    /**
     * Checks if the array has any digits in it
     * If yes - converts to integer
     * If not - returns result integer as 0
     *
     * @param resultIntegerChar - char array
     */
    public static void convertToInteger(char[] resultIntegerChar) {
    }

}
