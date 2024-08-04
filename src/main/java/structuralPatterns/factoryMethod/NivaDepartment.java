package structuralPatterns.factoryMethod;

public class NivaDepartment extends CarFactory {
    @Override
    public String createCar() {
        return "Нива" + super.createCar();
    }
}
