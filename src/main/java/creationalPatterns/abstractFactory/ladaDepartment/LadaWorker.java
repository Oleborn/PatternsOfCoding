package creationalPatterns.abstractFactory.ladaDepartment;

import creationalPatterns.abstractFactory.Worker;

public class LadaWorker implements Worker {
    @Override
    public String buildCar() {
        return Worker.super.buildCar()+ " Ладу";
    }
}
