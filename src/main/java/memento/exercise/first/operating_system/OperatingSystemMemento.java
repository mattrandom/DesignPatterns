package memento.exercise.first.operating_system;

import java.time.LocalDateTime;

// Memento
class OperatingSystemMemento {
    private int backupNumber;
    private LocalDateTime backupDate;

    OperatingSystemMemento(int backupNumber, LocalDateTime backupDate) {
        this.backupNumber = backupNumber;
        this.backupDate = backupDate;
    }

    int getBackupNumber() {
        return backupNumber;
    }

    LocalDateTime getBackupDate() {
        return backupDate;
    }
}
