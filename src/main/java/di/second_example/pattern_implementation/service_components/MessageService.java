package di.second_example.pattern_implementation.service_components;

/**
 * Service components should be designed with base class or interface.
 * It’s better to prefer interfaces or abstract classes that would define contract for the services.
 *
 * For our case, we can have MessageService that will declare the contract for service implementations.
 */
public interface MessageService {

    void sendMessage(String msg, String rec);
}
