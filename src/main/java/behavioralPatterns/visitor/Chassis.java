package behavioralPatterns.visitor;

public class Chassis implements CarElement {
    @Override
    public void beCreate(Worker worker) {
        worker.create(this);
    }

}
