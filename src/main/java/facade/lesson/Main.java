package facade.lesson;

import facade.lesson.deliverybox.DeliveryBoxFacade;

public class Main {
    public static void main(String[] args) {
        DeliveryBoxFacade facade = new DeliveryBoxFacade();
        facade.pickupPackage();
    }
}
