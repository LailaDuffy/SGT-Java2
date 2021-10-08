package lesson3_syntax;

import lesson1.helloWorldLibrary.WorldLibrary;
import org.w3c.dom.ls.LSOutput;


public class Lesson3 {

    final String SOME_CONSTANT = "constant"; // simple data type available throughout the class and can never be changed, "final" makes it un-overridable
    final float PI = 3.14f;

    public static void main(String[] args) {
        RocketShip ship = new RocketShip();
        ship.fly(10);

        Bird bird = new Bird();
        bird.fly(1);

        Penguin penguin = new Penguin();
        penguin.fly(10);

        if (penguin instanceof Penguin) {
            System.out.println("Penguin is a Penguin.");
        }

        if (penguin instanceof Bird) {
            System.out.println("Penguin is a Bird.");
        }

        /*if (penguin instanceof RocketShip) {
            System.out.println("Penguin cannot be a Rocket Ship.");
        }*/

        int result = 2;
        result += 5;
        System.out.println("The result is: + " + result);

        // I want to print my name

        Statics statics = new Statics();
        System.out.println(statics.getName());
        System.out.println(Statics.getSurname());


    }



    public static String boop() {
        return WorldLibrary.getName();
    }
}

enum RocketTypes {
    BEZOS,
    MUSK,
    BRANSON
}

interface CanFLyInterface { // interface is an agreement between the developer and the code of what methods will be used in the code
    boolean fly(int speed);
}

class RocketShip implements CanFLyInterface {

    @Override
    public boolean fly(int speed) {
        System.out.println("Whooooosh, I am flying!");
        return false;
    }
}

class Bird implements CanFLyInterface {

    @Override
    public boolean fly(int speed) {
        System.out.println("Chirp, chirp!");
        return false;
    }
}

class Penguin extends Bird {
    public boolean walk(int speed) {
        System.out.println("Quack, Quack!");
        return true;
    }
}