package observer.lesson.notification;

import observer.lesson.order.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("[SMS] Order number: " + order.getOrderNumber() + " has changed its status to: " + order.getOrderStatus());
    }
}

