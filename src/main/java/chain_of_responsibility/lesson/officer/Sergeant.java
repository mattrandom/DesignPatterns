package chain_of_responsibility.lesson.officer;

import chain_of_responsibility.lesson.message.Message;

public class Sergeant extends Officer {
    private static final int CODE = 10;
    private static final String NAME = "Sgt. John";

    @Override
    public void processMessage(Message message) {
        if (message.getCode() == CODE && message.getRank().equals(OfficerRank.SERGEANT)) {
            System.out.println(NAME + " has received a message: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
