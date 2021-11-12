package lesson20;

import com.sun.source.tree.Tree;

import java.util.*;

public class Lesson20Iterators {

    public static void main(String[] args) {

        List<String> planets = new ArrayList<String>();

        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");

        Iterator planetIterator = planets.iterator();

        while (planetIterator.hasNext()) {
            System.out.println(planetIterator.next());
        }

        Set<String> birds = new TreeSet<String>();
        birds.add("Parrot");
        birds.add("Eagle");
        birds.add("Sparrow");
        birds.add("Pigeon");

        Iterator birdsIterator = birds.iterator();

        while (birdsIterator.hasNext()) {
            System.out.println(birdsIterator.next()); // prints in an alphabetical order because it's a TreeSet
        }

        Queue<String> lidl = new LinkedList<>(); // one of the implementations of a queue

        lidl.add("A");
        lidl.add("B");
        lidl.add("C");

        System.out.println(lidl);

        Iterator lidlIterator = lidl.iterator();

        while (lidlIterator.hasNext()) {
            System.out.println(lidlIterator.next());
        }

        

    }
}
