package behavioralPatterns.iterator;

public class CarCollection {
    public static void main(String[] args) {
        String[] parts = {"Рама", "Колеса", "Руль", "Мотор"};
        Car car = new Car("Лада", parts);

        Iterator iterator = car.getIterator();
        System.out.println("Модель авто: " + car.getModel());
        System.out.println("Состоит из:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
