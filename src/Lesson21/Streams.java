package Lesson21;

import java.io.*;
import java.util.Scanner;

public class Streams {

    public static void main(String[] args) {

        // output stream STDOUT
        System.out.println("This is System STDOUT"); // prints out in the default output (console in this case)

        // input stream STDIN
        Scanner scan = new Scanner(System.in);
        String systemIn = scan.next();

        // error stream STDERR
       // throw new Exception("Throwing exception into STDERR stream");

        File newFile = new File("myOutput.txt");


        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter(newFile));
            writer.append("This is a new line to append to the file"); // > in command line
            writer.close();
        } catch (IOException e) {
            System.out.println("File does not exist");
        }

    }
}
