package bridge;

public class Player {
    public static void main(String[] args) {
        Weapon weapon = new Sword(new FireEnchantment());
        weapon.equip();
        weapon.attack();
        weapon.unequipped();

        Weapon weapon1 = new Staff(new IceEnchantment());
        weapon1.equip();
        weapon1.attack();
        weapon1.unequipped();
    }
}
