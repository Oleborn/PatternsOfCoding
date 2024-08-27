package behavioralPatterns.templateMethod;

public abstract class ConveyorTemplate {
    public void create() {
        System.out.println("Запуск конвеера");
        addChassis();
        System.out.println("Добавляем иные детали");
        System.out.println("Остановка конвеера");
    }
    public abstract void addChassis();
}
