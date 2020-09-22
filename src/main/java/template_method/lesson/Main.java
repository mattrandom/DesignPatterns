package template_method.lesson;

public class Main {
    public static void main(String[] args) {

        CarStartingSequence classic = new ClassicCarStartingSequence();
        CarStartingSequence automatic = new AutomaticTransmitionCarStartingSequence();

        classic.startTheCar();
        System.out.println("--------------------------");
        automatic.startTheCar();

    }
}
