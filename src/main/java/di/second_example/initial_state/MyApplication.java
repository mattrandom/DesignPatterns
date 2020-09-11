package di.second_example.initial_state;

/**
 * EmailService class holds the logic to send an email message to the recipient email address.
 * Our application code will be like below.
 */
public class MyApplication {

    private EmailService email = new EmailService();

    public void processMessages(String msg, String rec) {
        // do some msg validation, manipulation logic etc
        this.email.sendEmail(msg, rec);
    }

}
