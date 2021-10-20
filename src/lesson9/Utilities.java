package lesson9;

public class Utilities {

    public static class Delete {

        public static void delete(String fileName) {
            System.out.println("Deleted");
        }
    }

    public static class Create {

        public static void createFile() {
            System.out.println("File created");
        }
    }
}

class AnotherMainApp {

    public static void main(String[] args) {

        // method call via grouped (nested) classes
        Utilities.Create.createFile();
    }
}