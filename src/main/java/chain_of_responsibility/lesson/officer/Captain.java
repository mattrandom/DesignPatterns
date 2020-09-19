package chain_of_responsibility.lesson.officer;

import chain_of_responsibility.lesson.message.Message;

public class Captain extends Officer {
    private static final int CODE = 50;
    private static final String NAME = "Cpt. Trevor";


    @Override
    public void processMessage(Message message) {
        if (message.getCode() == CODE && message.getRank().equals(OfficerRank.CAPTAIN)) {
            System.out.println(NAME + " has received a message: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
