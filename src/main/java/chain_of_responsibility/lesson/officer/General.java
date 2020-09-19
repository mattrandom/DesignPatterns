package chain_of_responsibility.lesson.officer;

import chain_of_responsibility.lesson.message.Message;

public class General extends Officer {
    private static final int CODE = 100;
    private static final String NAME = "Gen. Matthius";

    @Override
    public void processMessage(Message message) {
        if (message.getCode() == CODE && message.getRank().equals(OfficerRank.GENERAL)) {
            System.out.println(NAME + " has received a message: " + message.getContent());
        } else {
            throw new IllegalStateException("Wrong recipient of a message or wrong encryption code!");
        }
    }
}
