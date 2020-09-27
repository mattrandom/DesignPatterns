package visitor.exercise.first.visitor;

import visitor.exercise.first.transport.Animal;
import visitor.exercise.first.transport.Person;
import visitor.exercise.first.transport.Shipment;

public class NameTransportVisitor implements TransportVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println("Animal kind: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Person name: " + person.getFirstName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Shipment designation: " + shipment.getPrefix() + "-" + shipment.getSerialNumber());
    }
}
