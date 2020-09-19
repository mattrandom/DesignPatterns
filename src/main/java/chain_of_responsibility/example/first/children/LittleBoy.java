package chain_of_responsibility.example.first.children;

import chain_of_responsibility.example.first.request.MotherRequest;

public class LittleBoy extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println(LittleBoy.class.getSimpleName() + " took the jar off the shelf.");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
