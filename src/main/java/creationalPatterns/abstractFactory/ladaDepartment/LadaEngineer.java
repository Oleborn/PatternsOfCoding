package creationalPatterns.abstractFactory.ladaDepartment;

import creationalPatterns.abstractFactory.Engineer;

public class LadaEngineer implements Engineer {
    @Override
    public String createCar() {
        return Engineer.super.createCar() + " Ладу";
    }
}
