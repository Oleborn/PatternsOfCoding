package structuralPatterns.decorator;

public class Trace {
    public static void main(String[] args) {
        Car car = new FlyUaz(new UazTruck(new Uaz()));
        System.out.println(car.drive());
    }
}
