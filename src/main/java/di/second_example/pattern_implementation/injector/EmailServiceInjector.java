package di.second_example.pattern_implementation.injector;

import di.second_example.pattern_implementation.service_components.EmailServiceImpl;
import di.second_example.pattern_implementation.service_consumer.Consumer;
import di.second_example.pattern_implementation.service_consumer.MyDIApplication;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }
}
