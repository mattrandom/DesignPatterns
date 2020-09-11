package di.second_example.pattern_implementation;

import di.second_example.pattern_implementation.injector.EmailServiceInjector;
import di.second_example.pattern_implementation.injector.MessageServiceInjector;
import di.second_example.pattern_implementation.injector.SMSServiceInjector;
import di.second_example.pattern_implementation.service_consumer.Consumer;

/**
 * our application classes are responsible only for using the service.
 * Service classes are created in injectors. Also if we have to further extend
 * our application to allow facebook messaging, we will have to write Service classes and injector classes only.
 *
 * So dependency injection implementation solved the problem with hard-coded dependency and helped us in making
 * our application flexible and easy to extend.
 */
public class Main {
    public static void main(String[] args) {
        String msg = "Hi Bro";
        String email = "whatever@random.com";
        String phone = "6666666666";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
