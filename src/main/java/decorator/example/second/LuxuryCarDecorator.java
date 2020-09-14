package decorator.example.second;

public class LuxuryCarDecorator extends CarDecorator {

    public LuxuryCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
//        car.assemble();
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
