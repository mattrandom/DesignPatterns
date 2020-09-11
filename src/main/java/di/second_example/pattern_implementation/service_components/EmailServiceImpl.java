package di.second_example.pattern_implementation.service_components;

/**
 * Email service that implement their common interface
 */
public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        // logic to send e-mail
        System.out.println("Email sent to " + rec + " with Message="+msg);
    }
}
