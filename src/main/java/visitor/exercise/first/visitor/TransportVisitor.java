package visitor.exercise.first.visitor;

import visitor.exercise.first.transport.Animal;
import visitor.exercise.first.transport.Person;
import visitor.exercise.first.transport.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);

    void visit(Person person);

    void visit(Shipment shipment);
}
