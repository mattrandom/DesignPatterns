package adapter.exercise.third.api;

import java.time.LocalDate;

public interface LibraryAPIv2 {

    int numberOfAvailableCopies(String bookTitle);

    LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth);

    boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth);
}
