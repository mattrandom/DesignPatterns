package di.third_example.pattern_implementation;

import di.third_example.pattern_implementation.transport.AirplaneTransport;
import di.third_example.pattern_implementation.transport.ShipTransport;
import di.third_example.pattern_implementation.transport.TruckTransport;

public class Main {
    public static void main(String[] args) {
        DeliveryPackage deliveryPackage = new DeliveryPackage("Książka", "Effective Java", "Proxima Centauri");

        DeliveryService airplaneDeliveryServie = new DeliveryService(new AirplaneTransport());
        DeliveryService truckDeliveryService = new DeliveryService(new TruckTransport());
        DeliveryService shipDeliveryService = new DeliveryService(new ShipTransport());

        airplaneDeliveryServie.sendPackage(deliveryPackage);
        truckDeliveryService.sendPackage(deliveryPackage);
        shipDeliveryService.sendPackage(deliveryPackage);
    }
}
