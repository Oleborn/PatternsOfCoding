package behavioralPatterns.visitor;

public class WorkerNivaDepartment implements Worker {
    @Override
    public void create(Chassis chassis) {
        System.out.println("Рабочий собирает шасси автомобиля Нива");
    }

    @Override
    public void create(Engine engine) {
        System.out.println("Рабочий собирает двигатель автомобиля Нива");
    }

    @Override
    public void create(Transmission transmission) {
        System.out.println("Рабочий собирает коробку передач автомобиля Нива");
    }
}
