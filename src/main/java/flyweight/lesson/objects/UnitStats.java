package flyweight.lesson.objects;

/**
 * The common part of the constant parameters of all classes.
 *
 * In order to ensure the immutability of a class, we do not create setters.
 * It would be similar if we were returning an object, an array or a list - we would have to
 * return a copy of the object, array or list, instead of these original objects.
 */
public class UnitStats {
    private String name;
    private int hp;
    private int armour;
    private int damageDealt;
    private int speed;
    private int resourceCost;

    public UnitStats(String name, int hp, int armour, int damageDealt, int speed, int resourceCost) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDealt = damageDealt;
        this.speed = speed;
        this.resourceCost = resourceCost;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getArmour() {
        return armour;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public int getSpeed() {
        return speed;
    }

    public int getResourceCost() {
        return resourceCost;
    }
}
