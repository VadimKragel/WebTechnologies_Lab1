package by.bsuir.lab1.task15;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BookTest {
    @Test
    void compareTo_ListOfBooks() {
        List<Book> books = Arrays.asList(
                new Book("BookName1", "Author1", 6238479033874L, 14),
                new Book("BookName2", "Author2", 9084759234855L, 105),
                new Book("BookName3", "Author3", 3084789375842L, 67),
                new Book("BookName4", "Author2", 7923874892374L, 12)
        );
        List<Book> expected = Arrays.asList(
                new Book("BookName3", "Author3", 3084789375842L, 67),
                new Book("BookName1", "Author1", 6238479033874L, 14),
                new Book("BookName4", "Author2", 7923874892374L, 12),
                new Book("BookName2", "Author2", 9084759234855L, 105)
        );
        Collections.sort(books);
        assertEquals(expected, books);
    }
}