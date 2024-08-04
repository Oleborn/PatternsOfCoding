package structuralPatterns.prototype;

public class Client {
    public static void main(String[] args) {
        Car firstCar = new Car(1, "First", true);
        firstCar.setId(2);
        System.out.println(firstCar);
        Car cloneCar = (Car) firstCar.copy();
        System.out.println(cloneCar);

        CarFactory factory = new CarFactory(firstCar);

        Car cloneCar2 = factory.cloneCar();

        System.out.println(cloneCar2);

        firstCar.setId(1);
        System.out.println(firstCar);
        System.out.println(cloneCar);

        cloneCar2.setTrunk(false);
        System.out.println(firstCar);
        System.out.println(cloneCar);
        System.out.println(cloneCar2);

    }
}
