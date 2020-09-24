package memento.exercise.first.operating_system;

// Caretaker
public class OperatingSystemCaretaker {
    private OperatingSystemMemento memento;

    public void addMemento(OperatingSystemMemento memento) {
        this.memento = memento;
        System.out.println(String.format("Backup No. %s was saved %s", memento.getBackupNumber(), memento.getBackupDate()));
    }

    public OperatingSystemMemento getMemento() {
        System.out.println(String.format("Backup No. %s has been loaded %s", memento.getBackupNumber(), memento.getBackupDate()));
        return memento;
    }
}
