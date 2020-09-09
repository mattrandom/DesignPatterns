package factory.lesson.abstract_factory;

import factory.lesson.abstract_factory.units.InfantryFactory;
import factory.lesson.abstract_factory.units.InfantryUnit;
import factory.lesson.abstract_factory.units.RedInfantryUnitFactory;
import factory.lesson.abstract_factory.units.UnitType;

public class Main {
    public static void main(String[] args) {
        InfantryFactory factory = new RedInfantryUnitFactory();

        InfantryUnit tank = factory.createUnit(UnitType.TANK);
        InfantryUnit rifleman = factory.createUnit(UnitType.RIFLEMAN);

        System.out.println(tank);
        System.out.println(rifleman);
    }
}
