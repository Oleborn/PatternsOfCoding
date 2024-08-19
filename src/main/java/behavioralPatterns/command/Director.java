package behavioralPatterns.command;

public class Director {
    public static void main(String[] args) {
        AssemblyMachine assemblyMachine = new AssemblyMachine();
        Worker worker = new Worker(
                new StartWorkCommand(assemblyMachine),
                new PauseWorkCommand(assemblyMachine),
                new StopWorkCommand(assemblyMachine)
        );

        worker.start();
        worker.pause();
        worker.stop();
    }
}
