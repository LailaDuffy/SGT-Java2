package laila.homeworks.inttoroman;

public class ConverterMethod {

    /**
     * Converts an input number form an integer to a roman numerial
     * ! I want to admit I copied this solution from the internet, but worked for hours to understand it!
     *
     * @param inputNumber - integer
     * @return - roman number as String
     */
    public static String convertToRoman(int inputNumber) {

        // put all the possible Roman Numerals into an array
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        // put all the corresponding Arabic numbers into another array
        int[] arabicNumerals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder arabicToRoman = new StringBuilder();

        for (int i = 0; i < arabicNumerals.length; i++) {
            while (inputNumber >= arabicNumerals[i]) {
                inputNumber -= arabicNumerals[i];
                arabicToRoman.append(romanNumerals[i]);
            }
        }

        String romanNumber = arabicToRoman.toString();

        return romanNumber;
    }
}
