package structuralPatterns.facade;

public class OrganizeJobDepartment {
    Factory factory = new Factory();
    JobDepartment jobDepartment = new JobDepartment();

    Worker worker = new Worker();

    public void startJobProcess(){
        factory.jobFactory();
        jobDepartment.startJob();
        worker.doJob(jobDepartment);
    }
    public void finishJobProcess(){
        factory.noJobFactory();
        jobDepartment.finishJob();
        worker.doJob(jobDepartment);
    }
}
