package di.second_example.pattern_implementation.injector;

import di.second_example.pattern_implementation.service_consumer.Consumer;

/**
 * Injector classes that will initialize the services and then the consumer classes.
 *
 * Let’s have an interface MessageServiceInjector with method declaration that returns the Consumer class.
 */
public interface MessageServiceInjector {

    Consumer getConsumer();
}
