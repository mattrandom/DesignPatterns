package factory.lesson.abstract_factory.units;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class RedFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        if (type == UnitType.RIFLEMAN) {
            return new Rifleman(20, 0 ,6);
        }
        throw new UnsupportedOperationException("Unknown type");
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        if (type == UnitType.TANK) {
            return new Tank(75, 0, 35);
        }
        throw new UnsupportedOperationException("Unknown type");
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        if (type == UnitType.HELICOPTER) {
            return new Helicopter(50, 0, 25);
        }
        throw new UnsupportedOperationException("Unknown type");
    }
}
