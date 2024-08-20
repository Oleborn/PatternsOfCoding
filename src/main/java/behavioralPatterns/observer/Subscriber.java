package behavioralPatterns.observer;

public interface Subscriber {
    public void update(EventCustom e);
    public String uniqId();
}
