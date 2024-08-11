package lightweight;

public class HealingPotion implements Potion{

    @Override
    public void drink() {
        System.out.println("Зелье лечения " + this.hashCode());
    }
}
