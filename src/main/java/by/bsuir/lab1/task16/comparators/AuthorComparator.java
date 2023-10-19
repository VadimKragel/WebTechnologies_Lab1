package by.bsuir.lab1.task16.comparators;

import by.bsuir.lab1.task16.Book;

import java.util.Comparator;
import java.util.Objects;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Objects.compare(o1.getAuthor(), o2.getAuthor(), String::compareTo);
    }
}
