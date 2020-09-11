package di.second_example.pattern_implementation.service_consumer;


/**
 * Consumer classes should be written in terms of service interface.
 *
 * We are not required to have base interfaces for consumer classes but
 * I will have a Consumer interface declaring contract for consumer classes.
 */
public interface Consumer {

    void processMessages(String msg, String rec);
}
