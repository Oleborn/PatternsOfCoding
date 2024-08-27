package behavioralPatterns.visitor;

public class Car implements CarElement {

    CarElement[] carElement;

    public Car() {
        this.carElement = new CarElement[]{
                new Chassis(),
                new Engine(),
                new Transmission()
        };
    }

    @Override
    public void beCreate(Worker worker) {
        for (CarElement carElement : carElement) {
            carElement.beCreate(worker);
        }
    }
}
