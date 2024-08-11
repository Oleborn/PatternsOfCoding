package lightweight;

import java.util.EnumMap;
import java.util.Map;

public class PotionFactory {
    private final Map<PotionType, Potion> potions;

    public PotionFactory() {
        potions = new EnumMap<>(PotionType.class);
    }

    Potion createPotion(PotionType type) {
        var potion = potions.get(type);
        if (potion == null) {
            switch (type) {
                case HEALING -> potion = new HealingPotion();
                case HOLY_WATER -> potion = new HolyWater();
            }
            potions.put(type, potion);
        }
        return potion;
    }
}
