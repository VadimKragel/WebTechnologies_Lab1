package by.bsuir.lab1.task16;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookComparatorsTest {

    @Test
    void TitleComparator() {
        List<Book> books = Arrays.asList(
                new Book("Book1", "Alice", 14),
                new Book("ProgrammerBook", "Bob", 105),
                new Book("Book", "Alice", 67),
                new Book("ProgrammerBook2", "Alex", 70),
                new Book("Book", "Alex", 12)
        );
        List<Book> expected = Arrays.asList(
                new Book("Book", "Alice", 67),
                new Book("Book", "Alex", 12),
                new Book("Book1", "Alice", 14),
                new Book("ProgrammerBook", "Bob", 105),
                new Book("ProgrammerBook2", "Alex", 70)

        );
        books.sort(BookComparators.getTitleComparator());
        assertEquals(expected, books);
    }

    @Test
    void TitleAuthorComparator() {
        List<Book> books = Arrays.asList(
                new Book("Book1", "Alice", 14),
                new Book("ProgrammerBook", "Bob", 105),
                new Book("Book", "Alice", 67),
                new Book("ProgrammerBook2", "Alex", 70),
                new Book("Book", "Alex", 12)
        );
        List<Book> expected = Arrays.asList(
                new Book("Book", "Alex", 12),
                new Book("Book", "Alice", 67),
                new Book("Book1", "Alice", 14),
                new Book("ProgrammerBook", "Bob", 105),
                new Book("ProgrammerBook2", "Alex", 70)

        );
        books.sort(BookComparators.getTitleAuthorComparator());
        assertEquals(expected, books);
    }

    @Test
    void AuthorTitleComparator() {
        List<Book> books = Arrays.asList(
                new Book("Book1", "Alice", 14),
                new Book("ProgrammerBook", "Bob", 105),
                new Book("Book", "Alice", 67),
                new Book("ProgrammerBook2", "Alex", 70),
                new Book("Book", "Alex", 12)
        );
        List<Book> expected = Arrays.asList(
                new Book("Book", "Alex", 12),
                new Book("ProgrammerBook2", "Alex", 70),
                new Book("Book", "Alice", 67),
                new Book("Book1", "Alice", 14),
                new Book("ProgrammerBook", "Bob", 105)
        );
        books.sort(BookComparators.getAuthorTitleComparator());
        assertEquals(expected, books);
    }

    @Test
    void AuthorTitlePriceComparator() {
        List<Book> books = Arrays.asList(
                new Book("Book1", "Alice", 14),
                new Book("ProgrammerBook", "Bob", 105),
                new Book("Book", "Alice", 78),
                new Book("Book", "Alice", 96),
                new Book("Book", "Alice", 67),
                new Book("ProgrammerBook2", "Alex", 70),
                new Book("Book", "Alex", 12)
        );
        List<Book> expected = Arrays.asList(
                new Book("Book", "Alex", 12),
                new Book("ProgrammerBook2", "Alex", 70),
                new Book("Book", "Alice", 67),
                new Book("Book", "Alice", 78),
                new Book("Book", "Alice", 96),
                new Book("Book1", "Alice", 14),
                new Book("ProgrammerBook", "Bob", 105)
        );
        books.sort(BookComparators.getAuthorTitlePriceComparator());
        assertEquals(expected, books);
    }
}