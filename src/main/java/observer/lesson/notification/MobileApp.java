package observer.lesson.notification;

import observer.lesson.order.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("[MOBILE-APP] Order number: " + order.getOrderNumber() + " has changed its status to: " + order.getOrderStatus());
    }
}

