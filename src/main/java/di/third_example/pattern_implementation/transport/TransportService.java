package di.third_example.pattern_implementation.transport;

import di.third_example.pattern_implementation.DeliveryPackage;

/**
 * Interface for all types of transport with method responsible for delivery package
 */
public interface TransportService {

    void delivery(DeliveryPackage deliveryPackage);
}
