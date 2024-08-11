package structuralPatterns.decorator;

public class Uaz implements Car{
    @Override
    public String drive() {
        return "УАЗ" + Car.super.drive();
    }
}
