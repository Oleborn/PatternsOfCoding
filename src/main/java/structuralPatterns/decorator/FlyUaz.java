package structuralPatterns.decorator;

public class FlyUaz extends UazWrapper{

    public FlyUaz(Car car) {
        super(car);
    }

    public String fly(){
        return " а еще и летает!";
    }
    @Override
    public String drive() {
        return super.drive() + fly();
    }
}
