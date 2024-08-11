package structuralPatterns.decorator;

public interface Car {

    default String drive(){
        return " едет";
    }
}
