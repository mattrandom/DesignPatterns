package observe.lesson.notification;

import observe.lesson.order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order) {
        System.out.println("[SMS] Order number: " + order.getOrderNumber() + " has changed its status to: " + order.getOrderStatus());
    }
}

