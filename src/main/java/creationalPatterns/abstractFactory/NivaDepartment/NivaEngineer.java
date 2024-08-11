package creationalPatterns.abstractFactory.NivaDepartment;

import creationalPatterns.abstractFactory.Engineer;

public class NivaEngineer implements Engineer {
    @Override
    public String createCar() {
        return Engineer.super.createCar() + " Ниву";
    }
}
