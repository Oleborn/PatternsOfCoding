package creationalPatterns.abstractFactory;

public interface CarTeamFactory {
    Engineer getEngineer();
    Worker getWorker();
    Manager getManager();
}
