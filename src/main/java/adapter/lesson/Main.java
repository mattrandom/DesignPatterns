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
    }
}
