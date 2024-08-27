package behavioralPatterns.strategy;

public class TestCarGround {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.setCarAction(new Stop());
        car.executeCarAction();

        car.setCarAction(new Drive());
        car.executeCarAction();

        car.setCarAction(new TurnLeft());
        car.executeCarAction();

        car.setCarAction(new TurnRight());
        car.executeCarAction();

        car.setCarAction(new Stop());
        car.executeCarAction();
    }
}
