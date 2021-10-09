package lesson3_syntax;

public class Floats {

    final static float PI = 3.14f;

    public static void main(String[] args) {

        // FLOAT, must but F or f at the end of the number
        Float simpleFloat = 3.14159265359f;

        // DOUBLE, is not mandatory to add D or d at the end of the number, but is a good practise
        Double simpleDouble = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679D;

        float radius = 5.5f;
        double diameter = 28.123d;

        float result = circlePerimeter(radius);
        System.out.println("When radius is " + radius + ", then the perimeter is " + result);

        System.out.println("When radius is " + radius + ", then the area is " + circleArea(radius));

    }

    static float circlePerimeter(float radius) {
        return 2* PI * radius;
    }

    static float circleArea(float radius) {
        return PI * radius * radius;
        // OR return (float) (PI * Math.pow(radius, 2));
    }

}
