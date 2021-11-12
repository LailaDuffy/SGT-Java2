package lesson20;

import java.util.HashMap;
import java.util.Map;

public class Lesson20Maps {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("Laila", 31);
        students.get("Laila"); // returns 31
        students.containsKey("Laila"); // returns true, because this key exists in the HashMap
        students.containsValue(31); // returns true, because this value exists in the HashMap


    }
}
