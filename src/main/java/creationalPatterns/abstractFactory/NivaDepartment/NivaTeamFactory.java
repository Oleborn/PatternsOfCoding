package creationalPatterns.abstractFactory.NivaDepartment;

import creationalPatterns.abstractFactory.CarTeamFactory;
import creationalPatterns.abstractFactory.Engineer;
import creationalPatterns.abstractFactory.Manager;
import creationalPatterns.abstractFactory.Worker;

public class NivaTeamFactory implements CarTeamFactory {
    @Override
    public Engineer getEngineer() {
        return new NivaEngineer();
    }

    @Override
    public Worker getWorker() {
        return new NivaWorker();
    }

    @Override
    public Manager getManager() {
        return new NivaManager();
    }
}
