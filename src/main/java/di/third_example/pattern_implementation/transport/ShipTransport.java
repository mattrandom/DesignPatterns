package di.third_example.pattern_implementation.transport;

import di.third_example.pattern_implementation.DeliveryPackage;

public class ShipTransport implements TransportService {

    @Override
    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Ship delivered package: " + deliveryPackage);
    }
}
