package chain_of_responsibility.lesson;

import chain_of_responsibility.lesson.message.Message;
import chain_of_responsibility.lesson.officer.*;

public class Main {
    public static void main(String[] args) {
        Message message = new Message(100, "Roger that. I'm on my way. ", OfficerRank.GENERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        try {
            sergeant.processMessage(message);
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }

    }
}
