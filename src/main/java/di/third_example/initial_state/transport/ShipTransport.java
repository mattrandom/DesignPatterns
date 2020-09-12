package di.third_example.initial_state.transport;

import di.third_example.initial_state.DeliveryPackage;

public class ShipTransport {

    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Ship delivered package: " + deliveryPackage);
    }
}
