package behavioralPatterns.command;

public class Worker {

    private Command startWorking;
    private Command pauseWorking;
    private Command stopWorking;

    public Worker(Command startWorking, Command pauseWorking, Command stopWorking) {
        this.startWorking = startWorking;
        this.pauseWorking = pauseWorking;
        this.stopWorking = stopWorking;
    }

    public void start() {
        startWorking.execute();
    }
    public void pause() {
        pauseWorking.execute();
    }
    public void stop() {
        stopWorking.execute();
    }
}
