package template_method.exercise.first;

public class OrdinaryDay extends Weekday {

    @Override
    protected int goWork(TransportType transportType) {
        switch (transportType) {
            case BIKE:
                return 15;
            case TRAM:
                return 10;
            case CAR:
                return 20;
            default:
                return 30;
        }
    }

    @Override
    protected void work() {
        System.out.println("Stay awake & focus on the goal!");
    }
}
