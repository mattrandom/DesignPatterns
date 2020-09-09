package factory.exercise.abstract_factory;

import factory.exercise.abstract_factory.cars.BmwModel;
import factory.exercise.abstract_factory.cars.Car;
import factory.exercise.abstract_factory.cars.FordModel;

public class Main {
    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BmwModel.X5);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMax);
        System.out.println(ford.getSteeringWheelPosition());
    }
}
