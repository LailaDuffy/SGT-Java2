package lesson33;

public class Power {

    public float pow(float base, int power) {

        // INTENTIONAL MISTAKE result = 0
        float result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
