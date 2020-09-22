package template_method.lesson;

public class AutomaticTransmitionCarStartingSequence extends ClassicCarStartingSequence {

    @Override
    public void setTheGear() {
        System.out.println("Automatic transmission");
    }
}
