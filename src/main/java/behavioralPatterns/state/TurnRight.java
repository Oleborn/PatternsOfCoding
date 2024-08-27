package behavioralPatterns.state;

public class TurnRight implements CarAction{
    @Override
    public void go() {
        System.out.println("Машина поворачивает направо...");
    }
}
