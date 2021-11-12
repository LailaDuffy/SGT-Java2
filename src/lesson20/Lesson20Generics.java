package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Lesson20Generics {

    public static void main(String[] args) {

        // this is very bad practise, as multiple different objects be mixed into one list
        List myList = new ArrayList();
        myList.add("SomeText");
        myList.add(5);

        // String someText = myList.get(0); // error as cannot distinguish what kind of object is being retrieved from the list
        String someText = (String) myList.get(0); // have to cast to not have an error
        Integer someInteger = (Integer) myList.get(1);

        // myList example equals to myList2, but <generics> should always be used as good practise
        List<String> myList2 = new ArrayList<String>();
        // String someText2 = myList2.get(0);
    }
}
