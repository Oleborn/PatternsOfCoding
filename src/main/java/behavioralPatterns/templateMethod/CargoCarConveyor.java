package behavioralPatterns.templateMethod;

public class CargoCarConveyor extends ConveyorTemplate {

    @Override
    public void addChassis() {
        System.out.println("Добавляем шасси от грузового автомобиля");
    }
}
