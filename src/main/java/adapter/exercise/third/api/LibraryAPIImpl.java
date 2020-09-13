package adapter.exercise.third.api;

import java.time.LocalDate;

public class LibraryAPIImpl implements LibraryAPI {

    @Override
    public boolean isAvailable(String bookTitle) {
        System.out.println("Checking the availability of the book: " + bookTitle);
        return true;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        System.out.println("Checking the date of returning the book: " + bookTitle);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        System.out.println("Reserve the book: " + bookTitle);
        return true;
    }
}
