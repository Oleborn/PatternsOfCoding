package creationalPatterns.abstractFactory.ladaDepartment;

import creationalPatterns.abstractFactory.Manager;

public class ManagerLada implements Manager {
    @Override
    public String sellCar() {
        return Manager.super.sellCar()+" Ладу";
    }
}
