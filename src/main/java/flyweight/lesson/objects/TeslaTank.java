package flyweight.lesson.objects;

public class TeslaTank {
    private String name;
    private int hp;
    private int armour;
    private int damageDealt;
    private int speed;
    private int xCoordinate;
    private int yCoordinate;
    private int hpLeft;
    private int resourceCost;

    public TeslaTank(String name, int hp, int armour, int damageDealt, int speed, int xCoordinate, int yCoordinate, int resourceCost) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDealt = damageDealt;
        this.speed = speed;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.hpLeft = hp;
        this.resourceCost = resourceCost;
    }
}
