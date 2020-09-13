package adapter.exercise.third;

import adapter.exercise.third.api.LibraryAPI;
import adapter.exercise.third.api.LibraryAPIImpl;

public class Main {

    public static void main(String[] args) {
        LibraryAPI api = new LibraryAPIImpl();
        User user = new User("Mateo", "Random", "666");
        BookConnector connector = new BookConnector(user, api);
        connector.checkAvailability("The Martian");
    }
}
