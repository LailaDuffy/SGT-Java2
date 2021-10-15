package laila.homeworks.myatoi;

import java.util.Scanner;

public class MyAtoiApplication {

    public static void main(String[] args) {

        // Ask the user for the input.
        String yesOrNo = "";
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please type in a positive (starts with '+') or a negative (starts with '-') number: ");
            String s = scan.nextLine();

            // Show the user the result.
            System.out.println("You typed: " + s);
            System.out.println("This is the number you typed: " + MyAtoiMethod.myAtoi(s));
            System.out.print("Is this correct? Please type Y or N: ");
            yesOrNo = scan.nextLine();

        } while (yesOrNo.equals("N"));
        System.out.println("Thank you, the number has been confirmed.");
    }
}
