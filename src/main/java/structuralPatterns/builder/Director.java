package structuralPatterns.builder;

public class Director {
    Builder builder;
    Director(Builder builder){
        this.builder = builder;
    }

    public void createDefaultPizza(){
        builder.setName("Just pizza");
        builder.setPrice(150);
        builder.setSize(6);
    }

    public void createCheesePizza(){
        builder.setName("Cheese pizza");
        builder.setPrice(150);
        builder.setSize(6);
        builder.setCheese(true);
    }
}
