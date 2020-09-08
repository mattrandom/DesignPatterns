package factory.lesson;

import factory.lesson.units.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);

        System.out.println(tank);
        System.out.println(rifleman);
    }
}
