package behavioralPatterns.chainOfResponsibility;

public class FinalReadinessLevelDepartment extends Notifier{
    public FinalReadinessLevelDepartment(int readinessLevel) {
        super(readinessLevel);
    }

    @Override
    public void write(String message) {
        System.out.println(message + " Отделом финальной готовности, авто проверено, автомобиль готов к продаже!");
    }
}
