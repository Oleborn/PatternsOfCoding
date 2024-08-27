package behavioralPatterns.templateMethod;

public class CreateDepartment {
    public static void main(String[] args) {
        ConveyorTemplate passengerCarConveyor = new PassengerCarConveyor();
        ConveyorTemplate cargoCarConveyor = new CargoCarConveyor();

        passengerCarConveyor.create();
        System.out.println("\n-------------------------------\n");
        cargoCarConveyor.create();
    }
}
