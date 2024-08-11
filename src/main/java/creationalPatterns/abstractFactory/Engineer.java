package creationalPatterns.abstractFactory;

public interface Engineer {
    default String createCar(){
        return "Инженер разрабатывает";
    }
}
