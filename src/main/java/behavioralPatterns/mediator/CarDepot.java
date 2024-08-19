package Behaviour1.Mediator;

public class CarDepot extends Object{

    boolean canProduceCars;
    private Mediator mediator;

    public CarDepot(Mediator mediator) {
        this.mediator = mediator;
        canProduceCars = true;
    }

    public boolean isCanProduceCars() {
        return canProduceCars;
    }

    public void setCanProduceCars(boolean canProduceCars)
    {
        this.canProduceCars = canProduceCars;
    }

    public void produceCar()
    {
        if(this.canProduceCars) {
            mediator.notifyCustom(this, "CAR_READY");
        }
        else {
            mediator.notifyCustom(this, "CAR_PRODUCE_STOPPED");
        }

    }
}
