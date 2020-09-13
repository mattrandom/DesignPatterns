package adapter.exercise.third.api;

import java.time.LocalDate;

public class LibraryAPIv2Impl implements LibraryAPIv2 {

    @Override
    public int numberOfAvailableCopies(String bookTitle) {
        System.out.println("Checking the number of copies of books available: " + bookTitle);
        return 3;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Checking the date of returning the book: " + bookTitle);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Reserve the book: " + bookTitle);
        return true;
    }
}
