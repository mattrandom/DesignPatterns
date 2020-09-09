package factory.exercise.abstract_factory;

import factory.exercise.abstract_factory.cars.*;

public class ContinentalFactory implements Factory {
    public static final SteeringWheelPosition POSITION = SteeringWheelPosition.RIGHT;

    @Override
    public Car buildBMW(BmwModel model) {
        switch (model) {
            case X5:
                return new Bmw("3.0", "Petrol", "2020", POSITION);
            case E60:
                return new Bmw("2.5", "Oil", "2019", POSITION);
            default:
                throw new IllegalArgumentException("You specified incorrect model");
        }
    }

    @Override
    public Car buildFord(FordModel model) {
        switch (model) {
            case CMax:
                return new Bmw("2.0", "Petrol", "2018", POSITION);
            case Focus:
                return new Bmw("1.8", "Oil", "2016", POSITION);
            default:
                throw new IllegalArgumentException("You specified incorrect model");
        }
    }
}
