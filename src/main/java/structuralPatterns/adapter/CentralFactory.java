package structuralPatterns.adapter;

public class CentralFactory {

    void createCar(){
        System.out.println("Машина создана!");
    }
    void updateCar(){
        System.out.println("Машина обновлена!");
    }
    void sellCar(){
        System.out.println("Машина продана!");
    }
}
