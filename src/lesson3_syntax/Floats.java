package lesson3_syntax;

public class Floats {

    final static float PI = 3.14f;

    public static void main(String[] args) {

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
