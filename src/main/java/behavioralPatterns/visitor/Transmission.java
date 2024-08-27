package behavioralPatterns.visitor;

public class Transmission implements CarElement {
    @Override
    public void beCreate(Worker worker) {
        worker.create(this);
    }
}
