package di.second_example.pattern_implementation.service_components;

/**
 * Email service that implement their common interface
 */
public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        // logic to send SMS
        System.out.println("SMS sent to " + rec + " with Message="+msg);
    }
}
