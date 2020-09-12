package di.third_example.pattern_implementation;

import di.third_example.pattern_implementation.transport.TransportService;

/**
 * TransportService injection passing by constructor.
 * When creating the DeliveryService object, we decide what means of transport to use.
 * Now that we have decided what means of transport to use - we can get rid of the second
 * unnecessary argument(enum TransportType) of the sendPackage method that is getting redundant now.
 */
public class DeliveryService {
    private final TransportService transportService;

    public DeliveryService(TransportService transportService) {
        this.transportService = transportService;
    }

    public void sendPackage(DeliveryPackage deliveryPackage) {
        transportService.delivery(deliveryPackage);
    }
}
