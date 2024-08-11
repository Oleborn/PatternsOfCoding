package creationalPatterns.builder;

public class Pizza {

    private int size;
    private double price;
    private String name;
    private boolean cheese;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", cheese=" + cheese +
                '}';
    }
}
