package creationalPatterns.abstractFactory.NivaDepartment;

import creationalPatterns.abstractFactory.Worker;

public class NivaWorker implements Worker {
    @Override
    public String buildCar() {
        return Worker.super.buildCar()+ " Ниву";
    }
}
