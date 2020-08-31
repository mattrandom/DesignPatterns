package observe.lesson.notification;

import observe.lesson.order.Order;

public class MobileApp {

    public void updateOrderStatus(Order order) {
        System.out.println("[MOBILE-APP] Order number: " + order.getOrderNumber() + " has changed its status to: " + order.getOrderStatus());
    }
}

