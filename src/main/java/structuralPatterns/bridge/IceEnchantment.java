package bridge;

public class IceEnchantment implements Enchantment{
    @Override
    public void onActivate() {
        System.out.println("Оружие покрылось инеем");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Оружие стало нормальным");
    }

    @Override
    public void apply() {
        System.out.println("Противника заморозило");
    }
}
