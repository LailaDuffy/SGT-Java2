package lesson9;

public class FinalMethods {

    // initialised during declaration
    final int CONSTANT_PI = 3;
    // blank final variable - not initialised during declaration
    final int CONSTANT_NOINIT;

    // to initialize a blank final variable, it must be initialised in ALL constructor
    public FinalMethods(int CONSTANT_NOINIT) {
        this.CONSTANT_NOINIT = 5;
    }

    public FinalMethods() {
        this.CONSTANT_NOINIT = 5;
    }

    public final void printHello() {
        System.out.println("Hello!");
    }

}

class ExtendedFinalMethods extends FinalMethods {

    // cannot override printHello as it is a final method
//    @Override
//    public void printHello() {
//        System.out.println("Bye!");
//    }
}