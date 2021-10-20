package lesson9;

// Abstract class - can only be extended
public abstract class Vehicle {

    // abstract method must be implemented within children classes
    public abstract double calcFuelEfficiency();

    // non-abstract methods can be used or overridden within children classes
    public double showCurrentSpeed() {
        return Math.random() * 100;
    }
}

// any other class cannot be public as there can only be one public class within a class file
class Truck extends Vehicle {

    // abstract method has to be implemented in child's class
    @Override
    public double calcFuelEfficiency() {
        return 0;
    }

}

class Application {

    public static void main(String[] args) {

        Truck myTruck = new Truck();

        myTruck.calcFuelEfficiency();

        System.out.println(myTruck.showCurrentSpeed());
    }
}
