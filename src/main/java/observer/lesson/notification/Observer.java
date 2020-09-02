package observer.lesson.notification;

import observer.lesson.order.Order;

public interface Observer {
    void update(Order order);
}
