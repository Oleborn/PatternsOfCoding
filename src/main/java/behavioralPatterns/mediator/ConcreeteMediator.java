package behavioralPatterns.mediator;

public class ConcreeteMediator implements Mediator {

    CarDepot carDepot;
    CarSaloon carSaloon;

    public ConcreeteMediator() {
        this.carDepot = new CarDepot(this);
        this.carSaloon = new CarSaloon(this);
    }

    @Override
    public void notifyCustom(Object sender, String event) {
        if(sender.getClass() == CarDepot.class)
        {
            if(event == "CAR_READY")
            {
                System.out.println(" Car ready in depoot ");
                carSaloon.onCarReady();
            }
            else if(event == "CAR_PRODUCE_STOPPED")
            {
                System.out.println(" Car produce stopped in depot");
            }
        }
        if(sender.getClass() == CarSaloon.class)
        {
            if(event == "CAR_ACCEPTED")
            {
                System.out.println(" Car accepted by saloon ");
            }
            else  if(event == "CAR_NOT_ACCEPTED")
            {
                System.out.println(" Car returned to depot ");
                this.carDepot.setCanProduceCars(false);
            }
        }
    }


    public void exec()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println((i + 1) + " Try to produce car in depot:");
            this.carDepot.produceCar();
        }
    }
}
