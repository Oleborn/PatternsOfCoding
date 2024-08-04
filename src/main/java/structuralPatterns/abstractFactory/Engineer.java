package structuralPatterns.abstractFactory;

public interface Engineer {
    default String createCar(){
        return "Инженер разрабатывает";
    }
}
