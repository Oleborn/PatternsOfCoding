package structuralPatterns.abstractFactory;

public interface Manager {
    default String sellCar(){
        return "Менеджер выставляет на продажу";
    }
}
