package behavioralPatterns.strategy;

public class TurnRight implements CarAction {
    @Override
    public void go() {
        System.out.println("Машина поворачивает направо...");
    }
}
