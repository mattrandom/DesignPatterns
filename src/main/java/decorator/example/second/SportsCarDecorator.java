package decorator.example.second;

/**
 * Concrete Decorators – Extending the base decorator functionality and modifying the component behavior accordingly.
 * We can have concrete decorator classes as LuxuryCar and SportsCar.
 */
public class SportsCarDecorator extends CarDecorator {

    public SportsCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
//        car.assemble();
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }

}
