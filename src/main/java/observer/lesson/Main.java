package observer.lesson;

import observer.lesson.notification.Email;
import observer.lesson.notification.MobileApp;
import observer.lesson.notification.TextMessage;
import observer.lesson.order.Order;
import observer.lesson.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();
        System.out.println("-------------------");

        order.changeOrderStatus(OrderStatus.SENT);

        System.out.println("-------------------");

        order.unregisterObserver(email);
        order.changeOrderStatus(OrderStatus.PICKED_UP);

    }
}
