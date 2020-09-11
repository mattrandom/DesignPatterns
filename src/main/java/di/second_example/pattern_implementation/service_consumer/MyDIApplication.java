package di.second_example.pattern_implementation.service_consumer;

import di.second_example.pattern_implementation.service_components.MessageService;

/**
 * Application class is just using the service.
 * Also use of service interface allows us to easily test the application
 * by mocking the MessageService.
 *
 * Now we are ready to write java dependency injector classes
 * that will initialize the service and also consumer classes.
 */
public class MyDIApplication implements Consumer {
    private MessageService service;

    public MyDIApplication(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec) {
        // do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }
}
