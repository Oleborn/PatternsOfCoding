package behavioralPatterns.chainOfResponsibility;

public class AverageReadinessLevelDepartment extends Notifier{
    public AverageReadinessLevelDepartment(int readinessLevel) {
        super(readinessLevel);
    }

    @Override
    public void write(String message) {
        //какая то логика
        System.out.println(message + " Отделом средней готовности, авто проверено, проблем нет!");
    }
}
