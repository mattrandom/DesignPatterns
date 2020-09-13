package adapter.exercise.third;

import adapter.exercise.third.api.LibraryAPI;

import java.time.LocalDate;

public class BookConnector {
    private final User user;
    private final LibraryAPI api;

    public BookConnector(User user, LibraryAPI api) {
        this.user = user;
        this.api = api;
    }

    public boolean checkAvailability(String title) {
        return api.isAvailable(title);
    }

    public boolean reservation(String title, User user) {
        return api.reserve(title, user.getPesel());
    }

    public LocalDate borrowedUntil(String title, User user) {
        return api.dueDate(title, user.getPesel());
    }
}
