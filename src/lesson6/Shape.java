package lesson6;

abstract public class Shape {

    abstract public int calculatePerimeter();
}

class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (height * width);
    }

    public Rectangle() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}

class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public int calculatePerimeter() {
        return side * 4;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}