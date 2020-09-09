package factory.lesson.abstract_factory.units;

/**
 * All products families have the same varieties (InfantryUnit/MechanizedUnit).
 *
 * This is a Tank variant of a MechanizedUnit.
 */
public class Tank extends MechanizedUnit {

    Tank(int hp, int exp, int dmgDone) {
        super(hp, exp, dmgDone);
    }
}
