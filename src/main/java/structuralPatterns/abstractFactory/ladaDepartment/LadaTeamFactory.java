package structuralPatterns.abstractFactory.ladaDepartment;

import structuralPatterns.abstractFactory.CarTeamFactory;
import structuralPatterns.abstractFactory.Engineer;
import structuralPatterns.abstractFactory.Manager;
import structuralPatterns.abstractFactory.Worker;

public class LadaTeamFactory implements CarTeamFactory {
    @Override
    public Engineer getEngineer() {
        return new LadaEngineer();
    }

    @Override
    public Worker getWorker() {
        return new LadaWorker();
    }

    @Override
    public Manager getManager() {
        return new ManagerLada();
    }
}
