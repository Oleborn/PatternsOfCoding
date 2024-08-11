package creationalPatterns.abstractFactory.ladaDepartment;

import creationalPatterns.abstractFactory.CarTeamFactory;
import creationalPatterns.abstractFactory.Engineer;
import creationalPatterns.abstractFactory.Manager;
import creationalPatterns.abstractFactory.Worker;

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
