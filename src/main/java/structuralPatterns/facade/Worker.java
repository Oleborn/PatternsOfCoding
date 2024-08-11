package structuralPatterns.facade;

public class Worker {
    public void doJob(JobDepartment jobDepartment){
        if (jobDepartment.isRunningJob()){
            System.out.println("Рабочий начинает работать над автомобилем.");
        }else {
            System.out.println("Рабочий играет в телефон.");
        }
    }
}
