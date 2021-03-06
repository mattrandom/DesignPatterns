package factory.lesson.abstract_factory.units;


/**
 * MechanizedUnit is the second product family. It has the same variants as InfantryUnit.
 */
public abstract class MechanizedUnit {
    private int hp;
    private int exp;
    private int dmgDone;

    protected MechanizedUnit(int hp, int exp, int dmgDone) {
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
