package structuralPatterns.abstractFactory;

public interface CarTeamFactory {
    Engineer getEngineer();
    Worker getWorker();
    Manager getManager();
}
