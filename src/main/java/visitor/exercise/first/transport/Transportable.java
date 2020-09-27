package visitor.exercise.first.transport;

import visitor.exercise.first.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}
