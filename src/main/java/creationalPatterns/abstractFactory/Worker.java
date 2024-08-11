package creationalPatterns.abstractFactory;

public interface Worker {
    default String buildCar(){
        return "Рабочий собирает";
    }
}
