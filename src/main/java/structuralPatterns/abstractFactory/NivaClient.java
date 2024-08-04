package structuralPatterns.abstractFactory;

import structuralPatterns.abstractFactory.NivaDepartment.NivaTeamFactory;

public class NivaClient {

    public static void main(String[] args) {
        CarTeamFactory teamFactory = new NivaTeamFactory();
        System.out.println(teamFactory.getEngineer().createCar());
        System.out.println(teamFactory.getWorker().buildCar());
        System.out.println(teamFactory.getManager().sellCar());
    }
}
