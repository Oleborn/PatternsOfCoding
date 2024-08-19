package Behaviour1.Observer;

public interface Subscriber {
    public void update(EventCustom e);
    public String uniqId();
}
