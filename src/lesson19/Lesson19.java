package lesson19;

import lesson19.exceptions.DBException;
import lesson19.exceptions.DBPasswordAllCapitalsException;
import lesson19.exceptions.DBPasswordIncorrectException;

public class Lesson19 {

    public static void main(String[] args) {
        Lesson19Exceptions exceptions = new Lesson19Exceptions();

        exceptions.divideByNumber(100, 50); // 2
        try {
            exceptions.divideByNumber(999, 0); // an error will be thrown
        } catch (ArithmeticException e) {
            System.out.println("Handle the code somewhat differently");
        }

        try{
            exceptions.multiplyByTwo(5);

        } catch (ArithmeticException e) {
            System.out.println("Even wrapped exceptions will be handled");
        } finally {
            System.out.println("This block will be always called!");
        }

        System.out.println("If there is some other code after the try/catch/finally - it will be executed.");

        try {
            System.out.println("Connecting to the DB");
            throw new DBPasswordAllCapitalsException();
        } catch (DBException e) {
            // handle the exception
            System.out.println("The exception has been properly handled");

            if (e instanceof DBPasswordAllCapitalsException) {
                System.out.println("Exception is of type DB Password all capitals");
            } else if ( e instanceof DBPasswordIncorrectException) {
                System.out.println("Password is incorrect");
            }
        }

        try {
            throw new DBException("some custom message");
        } catch (DBException e) {
            System.out.println("DB exception with message: " + e.getMessage());
        }

        try {
            exceptions.multiplyByTwo(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Able to print something after printing the stack trace"); // this is executed, but printed before stack trace

        boolean userAuthenticated = true;
        assert userAuthenticated;
        System.out.println("user is authenticated");

        userAuthenticated = false;
        try {
            assert userAuthenticated;
        } catch (AssertionError e) {
            System.out.println("user is not authenticated");
        }
    }

    int method1() {
        try{
            System.out.println("something");
            return 0;
        } catch (Exception e) {
            // more handling can be added here
            throw e;
        }
    }
    // method1 is pretty much identical to method2
    int method2() throws Exception {
        System.out.println("Something");
        return 0;
    }
}
