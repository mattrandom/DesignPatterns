package adapter.lesson;

import adapter.lesson.pack.*;

public class Main {
    public static void main(String[] args) {
        ContinentalDevice radio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("The music is playing.");
            }
        };
        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);

        UKDevice radioUk = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("London calling to the faraway towns!");
            }
        };
        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(radioUk);

        /**
         * The problem is when we want to plug UK's radio in european socket
         *
         * Now we can do it using Adapter
         */
        UKToContinentalAdapter adapter = new UKToContinentalAdapter(radioUk);
        continentalSocket.plugIn(adapter);

        /**
         * Two-way Adapter
         */
        ContinentalDevice continentalRadio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Continental radio is broadcasting from a British power socket");
            }
        };

        UKDevice britishRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("British radio is broadcasting from a Continental power socket");
            }
        };

        ContinentalSocket continentalSocket2 = new ContinentalSocket();
        UKSocket ukSocket2 = new UKSocket();

        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(britishRadio, continentalRadio);

        continentalSocket2.plugIn(twoWayAdapter);
        ukSocket2.plugIn(twoWayAdapter);
    }
}
