package behavioralPatterns.templateMethod;

public class PassengerCarConveyor extends ConveyorTemplate {

    @Override
    public void addChassis() {
        System.out.println("Добавляем шасси от легкового автомобиля");
    }

}
