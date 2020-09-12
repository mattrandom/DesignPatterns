package di.third_example.initial_state.transport;

import di.third_example.initial_state.DeliveryPackage;

public class TruckTransport {

    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Truck delivered package: " + deliveryPackage);
    }
}
