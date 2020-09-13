package adapter.exercise.third;

import adapter.exercise.third.api.LibraryAPI;
import adapter.exercise.third.api.LibraryAPIImpl;
import adapter.exercise.third.api.LibraryAPIv2;
import adapter.exercise.third.api.LibraryAPIv2Impl;

public class Main {

    public static void main(String[] args) {
        LibraryAPIv2 apiV2 = new LibraryAPIv2Impl();
        User user = new User("Mateo", "Random", "666");
        APIAdapter apiAdapter = new APIAdapter(apiV2, user);
        BookConnector connector = new BookConnector(user, apiAdapter);
        connector.checkAvailability("The Martian");
        connector.reservation("The Martian", user);
        connector.borrowedUntil("The Martian", user);
    }
}
