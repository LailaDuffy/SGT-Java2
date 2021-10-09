package lesson4;

public class ControlFlows {


    public static void main(String[] args) {

        int myAge = 31;

        // BRANCHING statement examples
        // if statements
        if (myAge > 64) {
            System.out.println("Retirement time");
        } else if (myAge < 7) {
            System.out.println("Nursery time");

        } else {
            System.out.println("Time to work");
        }

        // switch statements
        switch (myAge) {
            case 5:
                System.out.println("5 years old");
                break;
            case 31:
                System.out.println("31 years old");
                break;
            case 55:
                System.out.println("55 years old");
                break;
            default:
                System.out.println("Some other age");
                break;
        }

        // simple for loop example
        for (int i = 0; i < 10; i++) {
            System.out.println("Are you finished? " + i);
        }
        System.out.println("Finally!");

        // simple for-each example
        String[] students = new String[5];
        students[0] = "Laura";
        students[1] = "Jekaterina";
        students[2] = "Marina";
        students[3] = "Tatjana";

        for (String studentName : students) {
            System.out.println(studentName);
        }

        // while loop (used when end conditions are not known)
        int i = 0;
        while (i < 20) {
            System.out.println("Loop is still running " + i);
            i++;
        }

        // do-while loop (it will run at least once)
        do {
            System.out.println("Thi should be executed at least once");
        } while (i < 0); // i = 19 from the last assignment, but the code will execute once

        // Infinite loop with break
        // stop the loop when breakCondition is larger than 10
        int breakCondition = 0;
        do {
            if (breakCondition > 10) {
                break;
            }
            breakCondition++;
            System.out.println("Break condition " + breakCondition);
        } while (true);
        System.out.println("We are out of infinite loop");

        // loop where elements are skipped from 3 to 7
        for (int j = 0; j < 10; j++) {
            if (j > 3 && j < 7) {
                continue;
            }
            System.out.println("Some element that is not between 3 and 7 not included " + j);
        }


    }
}
