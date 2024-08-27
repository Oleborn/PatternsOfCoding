package behavioralPatterns.strategy;

public class Car {
    CarAction carAction;

    public void setCarAction(CarAction carAction) {
        this.carAction = carAction;
    }

    public void executeCarAction() {
        carAction.go();
    }
}
