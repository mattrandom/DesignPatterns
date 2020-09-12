package adapter.lesson;

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
                System.out.println("London is on fire!");
            }
        };
        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(radioUk);

        // The problem is when we want to plug UK's radio in european socket
        continentalSocket.plugIn(radio); // incompatybile types
    }
}
