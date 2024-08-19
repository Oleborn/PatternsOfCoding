package Behaviour1.Observer;

public class CarVendor {
    private CarDepot carDepot;
    private CarSaloon saloonA,saloonB;

    public CarVendor() {
        carDepot = new CarDepot();
        saloonA = new CarSaloon();
        saloonB = new CarSaloon();
    }

    public void mainLogic()
    {
        carDepot.addSubscriber(saloonA);
        carDepot.addSubscriber(saloonB);
        for(int i = 0; i < 5; i++) {
            carDepot.produceCar();
        }
    }

    public static void main(String[] args) {
        CarVendor carVendor = new CarVendor();
        carVendor.mainLogic();
    }

}
