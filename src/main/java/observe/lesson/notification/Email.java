package observe.lesson.notification;

import observe.lesson.order.Order;

public class Email {

    public void updateOrderStatus(Order order) {
        System.out.println("[E-MAIL] Order number: " + order.getOrderNumber() + " has changed its status to: " + order.getOrderStatus());
    }
}

