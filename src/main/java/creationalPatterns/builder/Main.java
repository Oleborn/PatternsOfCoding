package creationalPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new PizzaBuilder();
        Director director = new Director(builder);

        director.createDefaultPizza();
        System.out.println(builder.build());

        director.createCheesePizza();
        System.out.println(builder.build());

        PizzaTwo two = new PizzaTwo(1,2,"sdf",true);
    }
    public record PizzaTwo(int size, double price,String name,boolean cheese){}
}
