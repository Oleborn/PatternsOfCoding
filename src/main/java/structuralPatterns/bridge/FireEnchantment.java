package bridge;

public class FireEnchantment implements Enchantment{
    @Override
    public void onActivate() {
        System.out.println("Оружие загорелось");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Оружие остыло");
    }

    @Override
    public void apply() {
        System.out.println("Добавили жару");
    }
}
