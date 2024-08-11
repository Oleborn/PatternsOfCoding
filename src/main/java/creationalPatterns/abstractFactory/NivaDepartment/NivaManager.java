package creationalPatterns.abstractFactory.NivaDepartment;

import creationalPatterns.abstractFactory.Manager;

public class NivaManager implements Manager {
    @Override
    public String sellCar() {
        return Manager.super.sellCar()+ " Ниву";
    }
}
