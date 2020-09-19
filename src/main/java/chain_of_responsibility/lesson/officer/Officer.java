package chain_of_responsibility.lesson.officer;

import chain_of_responsibility.lesson.message.Message;

public class Officer {
    private boolean sergeant;
    private boolean captain;
    private boolean general;

    public void receiveMessage(Message message) {
        if (sergeant) {
            System.out.println("Sergeant received the message: " + message.getContent());
        } else if (captain) {
            System.out.println("Captain received the message: " + message.getContent());
        } else if (general) {
            System.out.println("General received the message: " + message.getContent());
        } else {
            System.out.println("Wrong recipient of the message!");
        }
    }

    public void setSergeant(boolean sergeant) {
        this.sergeant = sergeant;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }
}
