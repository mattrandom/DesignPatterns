package template_method.lesson;

public class ClassicCarStartingSequence extends CarStartingSequence {

    @Override
    public void setTheGear() {
        System.out.println("Choose the right gear");
    }

    @Override
    public void startTheIgnition() {
        System.out.println("Turn the key in the ignition to start the engine");
    }

}
