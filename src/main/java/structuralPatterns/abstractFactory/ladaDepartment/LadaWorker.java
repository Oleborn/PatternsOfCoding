package structuralPatterns.abstractFactory.ladaDepartment;

import structuralPatterns.abstractFactory.Worker;

public class LadaWorker implements Worker {
    @Override
    public String buildCar() {
        return Worker.super.buildCar()+ " Ладу";
    }
}
