package structuralPatterns.abstractFactory.NivaDepartment;

import structuralPatterns.abstractFactory.Worker;

public class NivaWorker implements Worker {
    @Override
    public String buildCar() {
        return Worker.super.buildCar()+ " Ниву";
    }
}
