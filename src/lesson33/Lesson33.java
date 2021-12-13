package lesson33;

public class Lesson33 {

    public static void main(String[] args) {

        Adder adder = new Adder();
        Multiplier multiplier = new Multiplier();
        Power power = new Power();

        // y = x^2 + 2x + 4
        // need to work out y

        float x = 2f;
        float p1 = power.pow(x, 2);
        float p2 = multiplier.multiply(x, 2);
        float p3 = adder.add(p1, p2);
        float result = adder.add(p3, 4);

        System.out.println("Result: " + result);
    }
}
