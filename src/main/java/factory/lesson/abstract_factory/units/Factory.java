package factory.lesson.abstract_factory.units;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public abstract class Factory {
    public abstract InfantryUnit createInfantryUnit(UnitType type);
    public abstract MechanizedUnit createMechanizedUnit(UnitType type);
    public abstract AirUnit createAirUnit(UnitType type);
}
