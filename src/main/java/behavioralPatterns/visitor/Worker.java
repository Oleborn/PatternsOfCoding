package behavioralPatterns.visitor;

public interface Worker {
    public void create(Chassis chassis);
    public void create(Engine engine);
    public void create(Transmission transmission);
}
