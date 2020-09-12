package di.third_example.pattern_implementation.transport;

import di.third_example.pattern_implementation.DeliveryPackage;

public class AirplaneTransport implements TransportService {

    @Override
    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Airplane delivered package: " + deliveryPackage);
    }
}
