package observer.lesson.notification;

import observer.lesson.order.Order;

public class Email implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("[E-MAIL] Order number: " + order.getOrderNumber() + " has changed its status to: " + order.getOrderStatus());
    }
}

