package factory.lesson.abstract_factory.units;

public class RedInfantryUnitFactory extends InfantryFactory {

    @Override
    public InfantryUnit createUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(200, 0, 20);
            case RIFLEMAN:
                return new Rifleman(100, 0, 10);
            default:
                throw new UnsupportedOperationException("No such a type");
        }
    }
}
