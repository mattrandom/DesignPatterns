package chain_of_responsibility.example.first.request;

import chain_of_responsibility.example.first.children.Shelf;

public class MotherRequest {
    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
