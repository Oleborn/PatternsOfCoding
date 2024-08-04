package structuralPatterns.abstractFactory.NivaDepartment;

import structuralPatterns.abstractFactory.CarTeamFactory;
import structuralPatterns.abstractFactory.Engineer;
import structuralPatterns.abstractFactory.Manager;
import structuralPatterns.abstractFactory.Worker;

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
