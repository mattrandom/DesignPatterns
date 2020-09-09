package factory.exercise.abstract_factory.cars;

public abstract class Car {
    private String engineCapacity;
    private String fuel;
    private String yearOfProduction;
    private SteeringWheelPosition steeringWheelPosition;

    protected Car(String engineCapacity, String fuel, String yearOfProduction, SteeringWheelPosition steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuel = fuel;
        this.yearOfProduction = yearOfProduction;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
