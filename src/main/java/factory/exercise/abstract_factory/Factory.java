package factory.exercise.abstract_factory;

import factory.exercise.abstract_factory.cars.BmwModel;
import factory.exercise.abstract_factory.cars.Car;
import factory.exercise.abstract_factory.cars.FordModel;

public interface Factory {
     Car buildBMW(BmwModel model);
     Car buildFord(FordModel model);
}
