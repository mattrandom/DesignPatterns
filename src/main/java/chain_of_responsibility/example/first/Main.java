package chain_of_responsibility.example.first;

import chain_of_responsibility.example.first.children.*;
import chain_of_responsibility.example.first.request.MotherRequest;

public class Main {
    public static void main(String[] args) {
        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);

        Child low = new LittleBoy();
        Child medium = new GirlOfAverageHeight();
        Child high = new HighHeelTeen();

        low.setTallerChild(medium);
        medium.setTallerChild(high);

        low.processRequest(motherRequest);
    }
}
