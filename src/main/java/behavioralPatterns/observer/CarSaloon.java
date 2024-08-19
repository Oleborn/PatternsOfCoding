package Behaviour1.Observer;

import jdk.nashorn.internal.runtime.QuotedStringTokenizer;

public class CarSaloon implements Subscriber {
    private int counter;
    @Override
    public void update(EventCustom e) {
        if(e.type == "CAR_PRODUCED")
        {
            if(e.sender.getClass() == CarDepot.class)
            {
                if(1 == (int)(Math.random() * 10) % 2) {
                    System.out.println("Car can be accepted by saloon " + this.uniqId());
                }
                else {
                    System.out.println("Car can NOT be accepted by saloon " + this.uniqId());
                }

            }
        }
    }

    @Override
    public String uniqId() {
        Integer id = new Integer(this.hashCode());
        return id.toString();
    }
}
