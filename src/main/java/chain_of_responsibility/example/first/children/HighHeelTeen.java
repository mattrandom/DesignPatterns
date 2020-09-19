package chain_of_responsibility.example.first.children;

import chain_of_responsibility.example.first.request.MotherRequest;

public class HighHeelTeen extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println(HighHeelTeen.class.getSimpleName() + " took the jar off the shelf.");
        } else {
            System.out.println("#Incorrect input parameters#");
        }
    }
}
