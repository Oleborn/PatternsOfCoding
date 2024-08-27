package behavioralPatterns.visitor;

public class Engine implements CarElement {
    @Override
    public void beCreate(Worker worker) {
        worker.create(this);
    }
}
