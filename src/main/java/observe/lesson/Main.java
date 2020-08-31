package observe.lesson;

import observe.lesson.notification.Email;
import observe.lesson.notification.MobileApp;
import observe.lesson.notification.TextMessage;
import observe.lesson.order.Order;
import observe.lesson.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        textMessage.updateOrderStatus(order);
        mobileApp.updateOrderStatus(order);
        email.updateOrderStatus(order);

    }
}
