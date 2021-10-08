package lesson3_syntax;

public class Conditionals {
    public static void main(String[] args) {
        String myName = "Laila";
        if (myName == "Laila") {
            System.out.println("Yes indeed!");
        } else {
            System.out.println("Nope, it is not!");
        }

        // conditional shorthand notation
        String whatIsMyName = myName == "Laila" ? "Yes indeed, it is!" : "No, it is not";
        System.out.println(whatIsMyName);

        String whatIsMyNameAgain = myName == "Leila" ? "Yes indeed, it is!" : "No, it is not";
        System.out.println(whatIsMyNameAgain);


        /* Write an application that decides whether the number is odd or even*/

        System.out.println(oddOrEven1(7));
        System.out.println(oddOrEven2(7));

    }

    static public String oddOrEven1(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    static public String oddOrEven2 (int number) {
       return number % 2 == 0 ? "even" : "odd";
    }
}
