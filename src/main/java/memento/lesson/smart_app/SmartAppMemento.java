package memento.lesson.smart_app;

// Memento
class SmartAppMemento {
    private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    Double getVersion() {
        return version;
    }
}
