package lesson21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderExample{

    public static void main(String[] args) {

        Path myPath = Paths.get("C:/Users/lailad/IdeaProjects");
        int count = myPath.getNameCount(); // shows how many files there are in the path
        System.out.println(count); // prints 3

        while (myPath.iterator().hasNext()) {
            System.out.println(myPath.iterator().next().getFileName());
        }
    }
}
