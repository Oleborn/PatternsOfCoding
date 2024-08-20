package behavioralPatterns.observer;

public class CarDepot extends Publisher{
    public void produceCar()
    {
        EventCustom e = new EventCustom( this, "CAR_PRODUCED");
        this.notifySubs(e);
    }
}
