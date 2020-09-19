package chain_of_responsibility.example.first.children;

import chain_of_responsibility.example.first.request.MotherRequest;

public class GirlOfAverageHeight extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println(GirlOfAverageHeight.class.getSimpleName() + " took the jar off the shelf.");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
