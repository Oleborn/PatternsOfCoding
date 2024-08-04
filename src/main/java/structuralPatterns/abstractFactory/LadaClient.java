package structuralPatterns.abstractFactory;

import structuralPatterns.abstractFactory.NivaDepartment.NivaTeamFactory;
import structuralPatterns.abstractFactory.ladaDepartment.LadaTeamFactory;

public class LadaClient {
    public static void main(String[] args) {
        CarTeamFactory teamFactory = new LadaTeamFactory();
        System.out.println(teamFactory.getEngineer().createCar());
        System.out.println(teamFactory.getWorker().buildCar());
        System.out.println(teamFactory.getManager().sellCar());
    }
}
