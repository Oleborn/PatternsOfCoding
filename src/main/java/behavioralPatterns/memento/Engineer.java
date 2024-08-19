package behavioralPatterns.memento;

public class Engineer {
    public static void main(String[] args) throws InterruptedException {
        ProjectCar projectCar = new ProjectCar();
        ProjectCarHub projectCarHub = new ProjectCarHub();

        System.out.println("Инженер создал проект авто, версия 1.0");
        projectCar.setVersionAndDate("1.0");

        System.out.println(projectCar);

        System.out.println("Сохранение проекта авто версии 1.0 в хранилище...");
        projectCarHub.setSave(projectCar.save());

        System.out.println("При разработке инженер допускает множество неочевидных ошибок...");

        Thread.sleep(2000);

        System.out.println("Инженер обноволяет проект авто до версии 1.1");
        projectCar.setVersionAndDate("1.1");

        System.out.println(projectCar);

        System.out.println("Версия 1.1 не проходит тест контроль!");

        System.out.println("Инженер откатывается на версию 1.0!");
        projectCar.load(projectCarHub.getSave());

        System.out.println("Версия проекта после отката:");
        System.out.println(projectCar);

    }
}
