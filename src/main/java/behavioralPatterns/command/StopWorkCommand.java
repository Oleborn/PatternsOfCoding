package behavioralPatterns.command;

public class StopWorkCommand implements Command {

    AssemblyMachine machine;

    public StopWorkCommand(AssemblyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.stopWork();
    }
}
