package lightweight;

public class Main {
    public static void main(String[] args) {
        AlchemistShop shop = new AlchemistShop();
        shop.topShelf().forEach(Potion::drink);
    }
}