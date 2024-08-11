package creationalPatterns.factoryMethod;

public class VolgaDepartment extends CarFactory{
    @Override
    public String createCar() {
        return "Волга" + super.createCar();
    }
}
