package factory.lesson.abstract_factory;

import factory.lesson.abstract_factory.units.*;

public class Main {
    public static void main(String[] args) {
         Factory blueFactory = new BlueFactory();
         Factory redFactory = new RedFactory();

        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);

        InfantryUnit blueInfantry = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);
        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);

        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);

        System.out.println(redInfantry + "\n" + redTank + "\n" + blueInfantry + "\n" + blueTank
                + "\n" + blueHelicopter + "\n" + redHelicopter);

    }
}
