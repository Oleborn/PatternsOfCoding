package behavioralPatterns.visitor;

public class FactoryDepartment {
    public static void main(String[] args) {
        Car car = new Car();
        Worker ladaWorker = new WorkerLadaDepartment();
        Worker nivaWorker = new WorkerNivaDepartment();

        System.out.println("Рабочий отдела Лада начал свою работу");
        car.beCreate(ladaWorker);
        System.out.println("\n-------------------------------------\n");
        System.out.println("Рабочий отдела Нива начал свою работу");
        car.beCreate(nivaWorker);
    }
}
