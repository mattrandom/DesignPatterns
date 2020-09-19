package chain_of_responsibility.example.first.children;

import chain_of_responsibility.example.first.request.MotherRequest;

public abstract class Child {
    private Child tallerChild;

    public abstract void processRequest(MotherRequest motherRequest);

    Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }
}
