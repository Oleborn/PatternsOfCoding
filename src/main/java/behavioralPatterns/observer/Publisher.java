package Behaviour1.Observer;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers;

    public Publisher() {
        subscribers = new ArrayList<Subscriber>(10);
    }

    public boolean addSubscriber(Subscriber s){
        System.out.println("Subscriber added " + s.uniqId());
        return subscribers.add(s);
    }
    public boolean removeSubscriber(Subscriber s)
    {
        boolean res = false;
        for(int i=0; i<subscribers.size(); i++)
        {

            if(subscribers.get(i).uniqId() == s.uniqId())
            {
                subscribers.remove(i);
                System.out.println("Subscriber removed " + s.uniqId());
                res = true;
                i--;
            }
        }
        return res;
        //return subscribers.removeIf(subscriber -> s.uniqId() == subscriber.uniqId());
    }

    public void notifySubs(EventCustom e)
    {
        System.out.println("Notify event " + e.type + " " + e.sender.hashCode());
        for(Subscriber s : subscribers)
        {
           s.update(e);
        }

       // subscribers.forEach(subscriber -> subscriber.update(e));
    }
}


