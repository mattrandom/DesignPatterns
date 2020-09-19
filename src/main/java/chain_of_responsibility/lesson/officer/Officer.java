package chain_of_responsibility.lesson.officer;

import chain_of_responsibility.lesson.message.Message;

public abstract class Officer {
    private Officer superiorOfficer;

    public Officer getSuperiorOfficer() {
        return superiorOfficer;
    }

    public void setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }

    public abstract void processMessage(Message message);
}
