package di.third_example.initial_state.transport;

import di.third_example.initial_state.DeliveryPackage;

public class AirplaneTransport {

    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Airplane delivered package: " + deliveryPackage);
    }
}
