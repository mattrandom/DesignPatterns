package visitor.exercise.first;

import visitor.exercise.first.transport.Animal;
import visitor.exercise.first.transport.Person;
import visitor.exercise.first.transport.Shipment;
import visitor.exercise.first.transport.Transportable;
import visitor.exercise.first.visitor.NameTransportVisitor;
import visitor.exercise.first.visitor.PriceTransportVisitor;
import visitor.exercise.first.visitor.TransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Transportable animal = new Animal("dog", 30);
        Transportable person = new Person("John", "Doe", true);
        Transportable shipment = new Shipment("PL", "348372", false);

        TransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);
        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));

        System.out.println("----------------------------");

        TransportVisitor nameTransportVisitor = new NameTransportVisitor();
        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));
    }
}
