package behavioralPatterns.observer;

public class EventCustom {
    public String type;
    public Object sender;

    public EventCustom(Object sender, String type) {
        this.sender = sender;
        this.type = type;
    }
}
