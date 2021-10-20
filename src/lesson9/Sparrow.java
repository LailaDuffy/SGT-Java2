package lesson9;

public class Sparrow implements FlyableInterface{

    @Override
    public void fly(int height) {
        System.out.println("I am flying at height " + height);
    }
}
