package lesson3_syntax;

public class Casts {
    public static void main(String[] args) {
        int justAnInteger = 50000;
        System.out.println(justAnInteger);
        System.out.println((long) justAnInteger);
        System.out.println((short) justAnInteger);
        // short can go up to 32xxx, so when it reached the max value of short it started to count again from -32xxx and got to -15536
        if (justAnInteger > 32000 || justAnInteger < -32000) {
            System.out.println(justAnInteger);
        } else {
            System.out.println((short) justAnInteger);
        }

        System.out.println((int)3.14F);
    }
}
