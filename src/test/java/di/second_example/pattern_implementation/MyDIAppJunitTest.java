package di.second_example.pattern_implementation;

import di.second_example.pattern_implementation.injector.MessageServiceInjector;
import di.second_example.pattern_implementation.service_components.MessageService;
import di.second_example.pattern_implementation.service_consumer.Consumer;
import di.second_example.pattern_implementation.service_consumer.MyDIApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyDIAppJunitTest {

    private MessageServiceInjector injector;

    @Before
    public void setUp() {
        // mock the injector with anonymous class
        injector = new MessageServiceInjector() {
            @Override
            public Consumer getConsumer() {
                // mock the message service
                return new MyDIApplication(new MessageService() {
                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Mock Message Service implementation");
                    }
                });
            }
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Bro", "whatever@random.com");
    }

    @After
    public void tear(){
        injector = null;
    }

}