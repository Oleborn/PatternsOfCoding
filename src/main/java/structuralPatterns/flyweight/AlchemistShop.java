package lightweight;

import java.util.ArrayList;
import java.util.List;

public class AlchemistShop {
    PotionFactory factory;

    public AlchemistShop(){
        factory = new PotionFactory();
    }

    List<Potion> topShelf(){
        List<Potion> potions = List.of(
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER)
        );
        return potions;
    }
}
