package behavioralPatterns.state;

public class Drive implements CarAction {
    @Override
    public void go() {
        System.out.println("Машина начинает движение...");
    }
}
