package lesson8.practical.task;

public class Rectangle extends Shape{

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle() {
    }

    public void whatIsThisOne() {
        super.whatIsThisShape();
    }

    public static void whatIsThisRectangle() {
        System.out.println("This is rectangular shape.");
    }

    public int calculatePerimeter() {
        return 2 * (length * breadth);
    }

    public int calculateArea() {
        return (length * breadth);
    }
}
