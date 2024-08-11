package structuralPatterns.proxy;

public class Client {
    public static void main(String[] args) {
        Car car = new ProxyCar("123");
        car.drive();
    }
}
