package behavioralPatterns.chainOfResponsibility;

public abstract class Notifier {
    private int readinessLevel;

    public Notifier nextNotifier;

    public Notifier(int readinessLevel) {
        this.readinessLevel = readinessLevel;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }
    public void notifyManager(String message, int level) {
        if (level >= readinessLevel) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level);
        }
    }
    public abstract void write(String message);
}
