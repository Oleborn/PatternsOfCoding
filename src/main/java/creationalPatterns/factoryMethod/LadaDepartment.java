package creationalPatterns.factoryMethod;

public class LadaDepartment extends CarFactory {
    @Override
    public String createCar() {
        return "Лада"+ super.createCar();
    }
}
