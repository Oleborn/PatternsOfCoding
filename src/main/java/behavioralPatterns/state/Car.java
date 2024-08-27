package behavioralPatterns.state;

public class Car {
    CarAction carAction;

    public void setCarAction(CarAction carAction) {
        this.carAction = carAction;
    }

    public void changeAction() {
        if (carAction instanceof Stop) {
            setCarAction(new Drive());
        } else if (carAction instanceof Drive) {
            setCarAction(new TurnLeft());
        }else if (carAction instanceof TurnLeft) {
            setCarAction(new TurnRight());
        } else if (carAction instanceof TurnRight) {
            setCarAction(new Stop());
        }
    }
    public void go(){
        carAction.go();
    }
}
