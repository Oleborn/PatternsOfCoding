package structuralPatterns.abstractFactory.NivaDepartment;

import structuralPatterns.abstractFactory.Manager;

public class NivaManager implements Manager {
    @Override
    public String sellCar() {
        return Manager.super.sellCar()+ " Ниву";
    }
}
