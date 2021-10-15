package lesson7;

import lv.laila.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson7App {

    public static void main(String[] args) {

        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escape Plan", 100);
        PeopleSpaceShip peopleSpaceShip = new PeopleSpaceShip(new Engine(), "Elon", 100, 3, new ArrayList<String>());

        // if want to add people in the constructor
        /*ArrayList<String> people = new ArrayList<>();
        people.add("Musk");
        people.add("Bezos");
        people.add("Brenson");*/
        // then add the 'people' to the constructor

        // send three specific people to space
        peopleSpaceShip.getNamesOfPeople().add("Musk"); // returns reference to array list of strings
        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Brenson");

        System.out.println(peopleSpaceShip);

        // polymorphism example - children can be passed instead of parents and the method still works
        printInfoAboutSpaceship(spaceShip);
        printInfoAboutSpaceship(peopleSpaceShip);

        //Overloading method example
        // Add some cargo
        peopleSpaceShip.addCargo();
        // this one should return integer
        peopleSpaceShip.addCargo(200);

        // Virtual method example
        // prints just "Cargo added"
        SpaceShip spaceShip2 = new SpaceShip();
        spaceShip2.addCargo();

        // prints 2 lines: "Cargo added" and "We have overridden method inside the PeopleSpaceShip"
        SpaceShip spaceShip3 = new PeopleSpaceShip();
        spaceShip3.addCargo();


        // Upcasting example casting to a superclass (parent's class) (usually done automatically)
        SpaceShip castedSpaceShip = (SpaceShip) peopleSpaceShip;

        // Downcasting example - need to be aware of possible issues when code is run
        // because it could have some methods that are missing
        // PeopleSpaceShip castedPeopleSpaceShip = (PeopleSpaceShip) spaceShip;
        // will not run, as method missing
        // better to use overloading
        // castedPeopleSpaceShip.getNamesOfPeople();





    }

    // example of polymorphism method
    public static void printInfoAboutSpaceship(SpaceShip spaceShip) {
        System.out.println("I have a SpaceShip: " + spaceShip);
    }
}
