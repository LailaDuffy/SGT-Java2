package lesson4;

public class Initialization {

    public static void main(String[] args) {

        // BAD EXAMPLE - AVOID DOING THIS!!!!
        String boopOrWoop; // value isn't initialized and pointing to null;
        boopOrWoop = boop();

        // GOOD EXAMPLE - DO LIKE THIS
        String woopOrBoop = woop(); // directly assign a value when creating the variable

    }

    static String boop() {
        return "boop";
    }

    static String woop() {
        return "woop";
    }
}
