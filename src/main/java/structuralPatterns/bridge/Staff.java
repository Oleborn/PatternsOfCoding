package bridge;

public class Staff implements Weapon{
    final Enchantment enchantment;

    public Staff(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void equip() {
        System.out.println("Взяли посох в руки");
        enchantment.onActivate();
    }

    @Override
    public void unequipped() {
        System.out.println("Спрятали посох");
        enchantment.onDeactivate();
    }

    @Override
    public void attack() {
        System.out.println("Ударил посохом");
        enchantment.apply();
    }
}
