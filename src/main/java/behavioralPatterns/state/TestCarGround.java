package behavioralPatterns.state;

public class TestCarGround {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        CarAction carAction = new Stop();

        car.setCarAction(carAction);

        for (int i = 0; i < 9; i++) {
            car.go();
            car.changeAction();
            Thread.sleep(500);
        }
    }
}
