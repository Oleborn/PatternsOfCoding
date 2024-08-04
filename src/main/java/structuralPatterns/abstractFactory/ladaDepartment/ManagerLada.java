package structuralPatterns.abstractFactory.ladaDepartment;

import structuralPatterns.abstractFactory.Manager;

public class ManagerLada implements Manager {
    @Override
    public String sellCar() {
        return Manager.super.sellCar()+" Ладу";
    }
}
