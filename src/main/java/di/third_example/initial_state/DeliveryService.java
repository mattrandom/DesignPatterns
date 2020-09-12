package di.third_example.initial_state;

import di.third_example.initial_state.transport.AirplaneTransport;
import di.third_example.initial_state.transport.ShipTransport;
import di.third_example.initial_state.transport.TransportType;
import di.third_example.initial_state.transport.TruckTransport;

public class DeliveryService {
    private final AirplaneTransport airplaneTransport = new AirplaneTransport();
    private final ShipTransport shipTransport = new ShipTransport();
    private final TruckTransport truckTransport = new TruckTransport();

    public void sendPackage(DeliveryPackage deliveryPackage, TransportType transportType) {
        switch (transportType) {
            case AIRPLANE:
                airplaneTransport.delivery(deliveryPackage);
                break;
            case SHIP:
                shipTransport.delivery(deliveryPackage);
                break;
            case TRUCK:
                truckTransport.delivery(deliveryPackage);
                break;
            default:
                System.out.println("Unrecognized transport type!");
        }
    }
}
