package laila.homeworks.inttoroman;

import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {

        String yesOrNo = "";

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please type a positive integer (whole number): ");
            int inputNumber = scan.nextInt();
            scan.nextLine();
            System.out.print("This number in Roman Numeral is: " + ConverterMethod.convertToRoman(inputNumber));
            System.out.println();
            System.out.print("Would you like to go again (Y or N): ");
            yesOrNo = scan.nextLine();

        } while (yesOrNo.equals("Y"));

        System.out.println("Thank you, have a good day!");
    }
}
