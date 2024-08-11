package structuralPatterns.decorator;

public class UazWrapper implements Car{

    Car car;

    public UazWrapper(Car car) {
        this.car = car;
    }

    @Override
    public String drive() {
        return car.drive();
    }
}
