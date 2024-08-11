package structuralPatterns.decorator;

public class UazTruck extends UazWrapper{
    public UazTruck(Car car) {
        super(car);
    }
    public String driveOffroad(){
        return " по бездорожью";
    }

    @Override
    public String drive() {
        return super.drive() + driveOffroad();
    }
}
