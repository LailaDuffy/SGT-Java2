package lesson4;

public class References {

    public static void main(String[] args) {

        // This will point to null
        String someString;

        // these two lines are identical
        someString = "Something";
        someString = new String("Something");

        Point point1 = new Point(7, 11);
        System.out.println("Coordinates point 1 " + point1.getX() + "-" + point1.getY());

        Point point2 = point1;

        Point point3 = new Point(point1.getX(), point1.getY()); // point1.clone() method to copy the object and not reference it

        System.out.println("Coordinates point 2 " + point2.getX() + "-" + point2.getY());

        point2.setX(100); // changing the number in the memory that point1 and point2 shares, so point 1 coordinates also are changed
        System.out.println("Coordinates point 2 " + point2.getX() + "-" + point2.getY());

        System.out.println("Coordinates point 1 " + point1.getX() + "-" + point1.getY());

        System.out.println("Coordinates point 3 " + point3.getX() + "-" + point3.getY());


    }
}

class Point {
    // Coordinates

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
