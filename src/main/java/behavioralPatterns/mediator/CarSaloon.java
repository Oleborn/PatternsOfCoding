package behavioralPatterns.mediator;

public class CarSaloon extends Object {
    public CarSaloon(Mediator mediator) {
        this.mediator = mediator;
        counter = 0;
    }
    private int counter;
    private Mediator mediator;

    public void onCarReady()
    {

        if(counter<5) {
            counter++;
            mediator.notifyCustom(this, "CAR_ACCEPTED");
        }
        else {
            mediator.notifyCustom(this, "CAR_NOT_ACCEPTED");
        }
    }

}
