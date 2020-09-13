package adapter.exercise.third;

import adapter.exercise.third.api.LibraryAPI;
import adapter.exercise.third.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {
    private final LibraryAPIv2 apiV2;
    private final User user;

    public APIAdapter(LibraryAPIv2 apiV2, User user) {
        this.apiV2 = apiV2;
        this.user = user;
    }

    @Override
    public boolean isAvailable(String bookTitle) {
        return apiV2.numberOfAvailableCopies(bookTitle) > 0;

    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return apiV2.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return apiV2.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}
