package di.second_example.initial_state;

/**
 * Let’s say we have an application where we consume EmailService to send emails.
 * Normally we would implement this like below.
 */
public class EmailService {

    public void sendEmail(String message, String receiver) {
        // logic to send e-mail
        System.out.println("Email sent to " + receiver + " with Message=" + message);
    }
}
