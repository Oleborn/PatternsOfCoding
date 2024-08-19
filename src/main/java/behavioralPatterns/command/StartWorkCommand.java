package behavioralPatterns.command;

public class StartWorkCommand implements Command {

    AssemblyMachine machine;

    public StartWorkCommand(AssemblyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.startWork();
    }
}
