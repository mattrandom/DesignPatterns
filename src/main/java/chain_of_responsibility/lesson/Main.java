package chain_of_responsibility.lesson;

import chain_of_responsibility.lesson.message.Message;
import chain_of_responsibility.lesson.officer.Officer;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Roger that. I'm on my way.");

        Officer officer = new Officer();
        officer.setGeneral(true);
        officer.receiveMessage(message);
    }
}
