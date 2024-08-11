package creationalPatterns.factoryMethod;

public class CarFactory implements Factory{
    @Override
    public String createCar() {
        return " произведена.";
    }


}
