package behavioralPatterns.chainOfResponsibility;

public class InitialReadinessLevelDepartment extends Notifier{

    public InitialReadinessLevelDepartment(int readinessLevel) {
        super(readinessLevel);
    }

    @Override
    public void write(String message) {
        System.out.println(message + " Отделом начальной готовности, авто проверено, проблем нет!");
    }
}
