package structuralPatterns.builder;

public interface Builder {
    void setSize(int size);
    void setPrice(double price);
    void setName(String name);
    void setCheese(boolean cheese);
    Pizza build();
}
