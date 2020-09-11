package di.second_example.pattern_implementation.injector;

import di.second_example.pattern_implementation.service_components.SMSServiceImpl;
import di.second_example.pattern_implementation.service_consumer.Consumer;
import di.second_example.pattern_implementation.service_consumer.MyDIApplication;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}
