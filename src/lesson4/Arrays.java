package lesson4;

public class Arrays {

    public static void main(String[] args) {


        // Define an array
        int[] arrayOfIntegers;

        // Initialize the array
        arrayOfIntegers = new int[5];

        // Define and initialize the array in one line
        int[] anotherArray = new int[10];

        // Print the alphabet
        System.out.println(initAlphabet());

        // Define array and initialize using shorthand notation (faster to write than the next example)
        String[] cities = {
                "Riga",
                "London",
                "Paris"
        };

        for ( String city: cities) {
            System.out.print(city + ", ");
        }

        // This is equal to:
        String[] cities2 = new String[3];
        cities2[0] = "Riga";
        cities2[0] = "Los Angeles";
        cities2[0] = "Singapore";

        for ( String city: cities2) {
            System.out.print(city + ", ");
        }

        String[] newCities = new String[3];
        System.arraycopy(cities, 0, cities2, 0, cities.length);

        for ( String city: newCities) {
            System.out.print(city + ", ");
        }

        // 2-D arrays
        int [][] points = new int[10][10];
        points[0][0] = 99;
        points[0][1] = 5;

        System.out.println(points);

        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(points[i][j] + " ");
            }
        }

    }

    static char[] initAlphabet() {

        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i); // all the digits and characters in the memory are going in order
        }
        return alphabet;
    }
}
