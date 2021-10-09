package lesson4;

public class Scopes {

    // defined within global scope (visible in all code within the class)
    static final int SOME_CONSTANT = 314; // this is defined in the scope of the class (global scope) and accessible to every method within the class and can not be overridden
    static int globalResult = 0; // this is also accessible to every method in the class, but can be overridden

    public static void main(String[] args) {

        int someNumber = SOME_CONSTANT;
        // someNumber is not accessible to the other methods. Only thing that can be done is to pass this number as an argument to the other methods

        System.out.println(multiplyByFIve(someNumber));

        // BAD EXAMPLE - something can interfere with the globalResult
        multiplyAndStoreInGlobalVariable(15);
        multiplyByTwo(5); // globalResult is overridden and this might be missed by the developer
        System.out.println("Global Result: " + globalResult);
    }

    static int scopeVisible(int someNumber) {
        // defined within local scope - visible only within the method defined
        boolean visibleInsideMethod = true; // defined in the method scope and ONLY visible inside the method (cannot be accessed by any other method, for example main)

        return someNumber * 2;
    }

    // DO LIKE THIS
    static int multiplyByFIve(int number) {
        // defined within local scope - visible only within the method defined
        int five = SOME_CONSTANT;

        return number * five;
    }

    // AVOID DOING THIS
    static void multiplyAndStoreInGlobalVariable(int number) {
        // defined within local scope - visible only within the method defined
        int five = SOME_CONSTANT;

        globalResult = number * five;

    }

    // AVOID DOING THIS
    static void multiplyByTwo(int number) {
        // defined within local scope - visible only within the method defined
        int five = SOME_CONSTANT;

        globalResult = number * 2;
    }
}
