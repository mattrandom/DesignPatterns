package di.third_example.pattern_implementation.transport;

import di.third_example.pattern_implementation.DeliveryPackage;

public class TruckTransport implements TransportService {

    @Override
    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Truck delivered package: " + deliveryPackage);
    }
}
