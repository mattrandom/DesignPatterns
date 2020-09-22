package template_method.exercise.first;

public abstract class Weekday {

    public final void sameShitDifferentDay(TransportType transportType) {
        wakeUp();
        getReady();
        int time = goWork(transportType);
        summary(time);
        work();
        goHome();
    }

    private void goHome() {
        System.out.println("Coming back home");
    }

    private void getReady() {
        System.out.println("Getting ready to go out");
    }

    private void wakeUp() {
        System.out.println("Turning off the alarm clock");
    }

    private void summary(int time) {
        System.out.println(String.format("It takes %s to get to work", time));
    }

    protected abstract int goWork(TransportType transportType);

    protected abstract void work();
}
