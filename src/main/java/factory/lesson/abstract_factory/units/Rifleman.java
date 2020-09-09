package factory.lesson.abstract_factory.units;

/**
 * All products families have the same varieties (InfantryUnit/MechanizedUnit).
 *
 * This is a Rifleman variant of a InfantryUnit.
 */
public class Rifleman extends InfantryUnit {

    Rifleman(int hp, int exp, int dmgDone) {
        super(hp, exp, dmgDone);
    }
}
