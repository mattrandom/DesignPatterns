package di.third_example.initial_state;

import di.third_example.initial_state.transport.TransportType;

public class Main {
    public static void main(String[] args) {
        DeliveryPackage deliveryPackage = new DeliveryPackage("Book", "Effective Java", "Proxima Centauri");

        DeliveryService deliveryService = new DeliveryService();

        deliveryService.sendPackage(deliveryPackage, TransportType.AIRPLANE);
        deliveryService.sendPackage(deliveryPackage, TransportType.SHIP);
        deliveryService.sendPackage(deliveryPackage, TransportType.TRUCK);
    }
}
