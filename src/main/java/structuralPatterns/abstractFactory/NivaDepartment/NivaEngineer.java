package structuralPatterns.abstractFactory.NivaDepartment;

import structuralPatterns.abstractFactory.Engineer;

public class NivaEngineer implements Engineer {
    @Override
    public String createCar() {
        return Engineer.super.createCar() + " Ниву";
    }
}
