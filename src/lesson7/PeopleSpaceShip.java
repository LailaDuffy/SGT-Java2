package lesson7;

import lv.laila.rocketscience.Engine;

import java.util.ArrayList;

public class PeopleSpaceShip extends SpaceShip{

    private int numberOfPeople;
    private ArrayList<String> namesOfPeople = new ArrayList<>();

    @Override
    public String toString() {
        return "PeopleSpaceShip{" +
                "numberOfPeople=" + numberOfPeople +
                ", namesOfPeople=" + namesOfPeople +
                ", engine=" + engine +
                ", name='" + name + '\'' +
                ", cargoSpace=" + cargoSpace +
                '}';
    }

    @Override
    public void addCargo() {
        super.addCargo();
        System.out.println("We have overridden method inside the PeopleSpaceShip");
    }

    public PeopleSpaceShip(Engine engine, String name, int cargoSpace, int numberOfPeople, ArrayList<String> namesOfPeople) {
        // calling the parent class constructor with super() and passing all the parents arguments in the brackets
        super(engine, name, cargoSpace);
        this.numberOfPeople = numberOfPeople;
        this.namesOfPeople = namesOfPeople;
    }

    public PeopleSpaceShip(int numberOfPeople, ArrayList<String> namesOfPeople) {
        this.numberOfPeople = numberOfPeople;
        this.namesOfPeople = namesOfPeople;
    }

    public PeopleSpaceShip() {
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public ArrayList<String> getNamesOfPeople() {
        return namesOfPeople;
    }

    public void setNamesOfPeople(ArrayList<String> namesOfPeople) {
        this.namesOfPeople = namesOfPeople;
    }
}
