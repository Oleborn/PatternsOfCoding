package behavioralPatterns.visitor;

public class WorkerLadaDepartment implements Worker {
    @Override
    public void create(Chassis chassis) {
        System.out.println("Рабочий собирает шасси автомобиля Лада");
    }

    @Override
    public void create(Engine engine) {
        System.out.println("Рабочий собирает двигатель автомобиля Лада");
    }

    @Override
    public void create(Transmission transmission) {
        System.out.println("Рабочий собирает коробку передач автомобиля Лада");
    }
}
