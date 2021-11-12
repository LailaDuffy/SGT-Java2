package Lesson21;

import java.sql.SQLOutput;
import java.util.*;

public class Lesson21Deque {

    public static void main(String[] args) {

        Deque<String> myDeque = new ArrayDeque<String>();

        myDeque.addFirst("1");
        myDeque.addFirst("2");
        myDeque.addFirst("3");
        myDeque.addFirst("4");

        // get number "4"
        String removedElement = myDeque.removeFirst(); // returns 4
        System.out.println(removedElement);

        // get number "3"
        removedElement = myDeque.removeFirst(); // returns 3
        System.out.println(removedElement);

        // get number "1"
        removedElement = myDeque.removeLast(); // returns 1
        System.out.println(removedElement);

        List<CustomObject> myList = new ArrayList<>();

        CustomObject co1 = new CustomObject();
        CustomObject co2 = new CustomObject();

        myList.add(co1);
        co1.setId(1);
        myList.add(co2);
        co2.id = 2;

        Iterator myIterator = myList.iterator();

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }

        String pet1 = new String ("parrot");
        String pet2 = new String ("penguin");

        // checks the reference in memory
        if (pet1 == pet2) {
            // do something
        }

        // checks the content of the objects
        if (pet1.equals(pet2)) {
            // do something
        }

    }

}

class CustomObject {
    String customField;
    int customInt;
    int id;

    public CustomObject() {
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomObject)) return false;
        CustomObject that = (CustomObject) o;
        return customInt == that.customInt && id == that.id && Objects.equals(customField, that.customField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customField, customInt, id);
    }
}
