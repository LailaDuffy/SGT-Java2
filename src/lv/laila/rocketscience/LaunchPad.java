package lv.laila.rocketscience;

import java.util.Scanner;

public class LaunchPad {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();
        System.out.println("There are this many rockets: " + Rocket.countRockets());

        System.out.println("Name of the rocket: " + rocket1.getName());
        System.out.println("Weight of the rocket: " + rocket1.getWeight());

        // NOT TO DO LIKE THIS
        Rocket rocket2 = rocket1;

        rocket1.setName("Starship");
        System.out.println("Name of the rocket: " + rocket1.getName());
        System.out.println("Name of the rocket: " + rocket2.getName());
        System.out.println("There are this many rockets: " + Rocket.countRockets());

        System.out.println(rocket1.id);

        renameRocket(rocket1, "MoonRover");

        System.out.println("Name of the rocket: " + rocket1.getName());
        System.out.println("Name of the rocket: " + rocket2.getName());

        // Not the best way to change the weight, only changes it locally within the method
        changeTheWeight(rocket1.getWeight(), 1000);
        System.out.println("The weight of the rocket stayed the same outside of the method: " + rocket1.getWeight());

        // The right way to change the weight, changes it in the original object
        rocket1.setWeight(1000);

        Rocket rocket3 = new Rocket("Enterprise", "red", 100, 200, new Engine(), "third");
        rocket3.printRocketData();

        rocket3 = null;

        Math.pow(2, 2);


    }

    /**
     * Renames the Rocket
     * Changes the original object
     * @param rocket
     * @param newName
     */
    private static void renameRocket(Rocket rocket, String newName) {
        rocket.setName(newName);
    }

    /**
     * DON'T DO LIKE THIS
     * Changes the weight only locally (within the method
     * The original weight stays the same
     * @param weight
     * @param newWeight
     */
    private static void changeTheWeight(int weight, int newWeight) {
        weight = newWeight;
        System.out.println("Weight was changed locally to: " + weight);
    }


}
