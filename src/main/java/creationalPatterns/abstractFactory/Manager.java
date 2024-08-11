package creationalPatterns.abstractFactory;

public interface Manager {
    default String sellCar(){
        return "Менеджер выставляет на продажу";
    }
}
