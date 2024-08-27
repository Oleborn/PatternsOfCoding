package behavioralPatterns.strategy;

public class Stop implements CarAction {
    @Override
    public void go() {
        System.out.println("Машина останавливается...");
    }
}
