package behavioralPatterns.state;

public class TurnLeft implements CarAction {
    @Override
    public void go() {
        System.out.println("Машина поаворачивает налево...");
    }
}
