package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Lesson20Lists {

    public static void main(String[] args) {

        List<String> streets = new ArrayList<String>();

        streets.add("Struktoru");
        streets.get(0); // retrieves the value by index

        streets.add("Rupniecibas"); // index 1

        streets.set(0, "Olivu"); // sets index 0 value as the new value

        System.out.println(streets);

        streets.addAll(streets); // concatenates 2 arrays

        System.out.println(streets);


    }
}
