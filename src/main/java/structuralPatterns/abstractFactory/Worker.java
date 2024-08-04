package structuralPatterns.abstractFactory;

public interface Worker {
    default String buildCar(){
        return "Рабочий собирает";
    }
}
