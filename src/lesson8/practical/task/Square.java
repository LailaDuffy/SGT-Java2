package lesson8.practical.task;

public class Square extends Rectangle {

   public Square(int s) {
        super(s, s);
   }

    public static void whatIsThisSquare() {
        System.out.println("Square is a rectangle");
    }

    public void whatIsThis() {
        super.whatIsThisRectangle();
    }

    public void whatIsThis1() {
       super.whatIsThisOne();
    }


}
