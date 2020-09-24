package memento.exercise.first;

import memento.exercise.first.operating_system.OperatingSystem;
import memento.exercise.first.operating_system.OperatingSystemCaretaker;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OperatingSystem operatingSystem = new OperatingSystem();
        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();

        operatingSystem.createBackup();

        Thread.sleep(3000);
        operatingSystem.createBackup();

        Thread.sleep(3000);
        operatingSystemCaretaker.addMemento(operatingSystem.save());

        operatingSystem.createBackup();

        Thread.sleep(3000);
        operatingSystem.createBackup();

        Thread.sleep(3000);
        operatingSystem.load(operatingSystemCaretaker.getMemento());
    }
}
