package lesson8.practical.task;

import java.sql.Array;

public class MainApplication {

    public static void main(String[] args) {

        // Task 1 and 2
        System.out.println("Tasks 1 and 2");
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();

        // 1 - method of parent class by object of parent class
        parentClass.whatClassIsThis();

        // 2 - method of child class by object of child class
        childClass.whatClassIsThisOne();

        // 3 - method of parent class by object of child class
        childClass.whatClassIsThis();
        System.out.println();

        // Task 3
        System.out.println("Task 3");

        //assign name, age, phone number, address and salary to an employee and a manager by making an object of
        // both of these classes and print the same

        Employee employee1 = new Employee();
        employee1.setName("Mark Ashworth");
        employee1.setAge(35);
        employee1.setAddress("1 Gold Street, London");
        employee1.setPhoneNumber(735548484);
        employee1.setSalary(20000);
        employee1.setSpecialization("Data Specialist");

        Manager manager1 = new Manager();
        manager1.setName("Lucy Hinds");
        manager1.setAge(33);
        manager1.setAddress("16 Park Lane, London");
        manager1.setPhoneNumber(72253644);
        manager1.setSalary(40000);
        manager1.setDepartment("Finance");

        employee1.printSalary();
        manager1.printSalary();
        System.out.println();

        // Task 4 and 5, and 6
        // Task 4 Print the area and perimeter of a rectangle and a square
        System.out.println("Tasks 4 and 5, and 6");

        Rectangle rectangle1 = new Rectangle(2, 10);
        System.out.println("Perimeter of rectangle: " + rectangle1.calculatePerimeter());
        System.out.println("Area of rectangle: " + rectangle1.calculateArea());

        Square square1 = new Square(5);
        System.out.println("Perimeter of square: " + square1.calculatePerimeter());
        System.out.println("Area of square: " + square1.calculateArea());
        System.out.println();

        // Task 5 Now repeat the above example to print the area of 10 squares
        Square[] arrayOfSquares = new Square[10];
        arrayOfSquares[0] = new Square(1);
        arrayOfSquares[1] = new Square(2);
        arrayOfSquares[2] = new Square(3);
        arrayOfSquares[3] = new Square(4);
        arrayOfSquares[4] = new Square(5);
        arrayOfSquares[5] = new Square(6);
        arrayOfSquares[6] = new Square(7);
        arrayOfSquares[7] = new Square(8);
        arrayOfSquares[8] = new Square(9);
        arrayOfSquares[9] = new Square(10);

        for (Square square : arrayOfSquares) {
            System.out.println("Area of square: " + square.calculateArea());
        }
        System.out.println();

        // Task 6 method of 'Shape' and 'Rectangle' class by the object of 'Square' class
       square1.whatIsThisRectangle();
       square1.whatIsThisShape();


    }
}
