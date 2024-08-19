package behavioralPatterns.command;

public class AssemblyMachine {

    public void startWork(){
        System.out.println("Сборочный станок запущен!");
    }

    public void pauseWork(){
        System.out.println("Работа на сборочном станке прервана!");
    }

    public void stopWork(){
        System.out.println("Сборочный станок остановлен!");
    }
}
