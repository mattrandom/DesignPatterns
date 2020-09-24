package memento.exercise.first.operating_system;

import java.time.LocalDateTime;

// Originator
public class OperatingSystem {
    private int backupNumber = 0;
    private LocalDateTime backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = LocalDateTime.now();
        System.out.println(String.format("Backup No. %s was created %s", this.backupNumber, this.backupDate));
    }

    public OperatingSystemMemento save() {
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    public void load(OperatingSystemMemento operatingSystemMemento) {
        this.backupNumber = operatingSystemMemento.getBackupNumber();
        this.backupDate = operatingSystemMemento.getBackupDate();
    }
}
