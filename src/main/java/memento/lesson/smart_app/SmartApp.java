package memento.lesson.smart_app;

// Originator
public class SmartApp {
    private Double version;

    public void changeVersion(Double version) {
        this.version = version;
        System.out.println("The current version has been changed to: " + this.version);
    }

    public SmartAppMemento save() {
        return new SmartAppMemento(this.version);
    }

    public void load(SmartAppMemento memento) {
        this.version = memento.getVersion();
    }
}
