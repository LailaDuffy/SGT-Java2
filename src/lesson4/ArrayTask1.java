package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNum;
        int arraySize;

        System.out.print("Please choose the length of an array by typing a number (1 or higher): ");
        arraySize = scanner.nextInt();

        int[] nums = new int[arraySize];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("You will need to enter a number between 1 and 10000 to fill the array.");
            System.out.print("Please type a number: ");
            inputNum = scanner.nextInt();
            nums[i] = inputNum;
            System.out.println();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        int max = nums[0];
        int secondMax = nums[0];
        int thirdMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];
           }
        }
        System.out.println();
        System.out.println("The third highest number is: " + thirdMax);


    }
}
