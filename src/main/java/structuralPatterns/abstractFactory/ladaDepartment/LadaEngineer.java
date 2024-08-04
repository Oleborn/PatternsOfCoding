package structuralPatterns.abstractFactory.ladaDepartment;

import structuralPatterns.abstractFactory.Engineer;

public class LadaEngineer implements Engineer {
    @Override
    public String createCar() {
        return Engineer.super.createCar() + " Ладу";
    }
}
