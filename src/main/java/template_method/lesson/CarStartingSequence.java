package template_method.lesson;

public abstract class CarStartingSequence {

    public final void startTheCar() {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Press the accelerator pedal");
    }

    private void fastenSeatbelts() {
        System.out.println("Fasten out seat belts");
    }

    protected abstract void setTheGear();

    protected abstract void startTheIgnition();
}
