package factory.lesson.abstract_factory.units;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (InfrantryUnit/MechanizedUnit).
 * All products of the same family have the common abstract parrent.
 *
 * This is the common abstract parrent for InfantryUnit family.
 */
public abstract class InfantryUnit {
    private int hp;
    private int exp;
    private int dmgDone;

    protected InfantryUnit(int hp, int exp, int dmgDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmgDone() {
        return dmgDone;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", exp=" + exp +
                ", dmgDone=" + dmgDone +
                '}';
    }
}
