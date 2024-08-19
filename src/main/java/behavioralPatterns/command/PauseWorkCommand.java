package behavioralPatterns.command;

public class PauseWorkCommand implements Command {

    AssemblyMachine machine;

    public PauseWorkCommand(AssemblyMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.pauseWork();
    }
}
