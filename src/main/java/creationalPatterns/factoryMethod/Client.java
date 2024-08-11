package creationalPatterns.factoryMethod;

public class Client {
    public static void main(String[] args) {
        System.out.println(new NivaDepartment().createCar());
        System.out.println(new LadaDepartment().createCar());
        System.out.println(new VolgaDepartment().createCar());
    }
}
