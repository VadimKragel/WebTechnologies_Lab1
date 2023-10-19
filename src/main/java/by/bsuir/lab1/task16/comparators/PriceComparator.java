package by.bsuir.lab1.task16.comparators;

import by.bsuir.lab1.task16.Book;

import java.util.Comparator;
import java.util.Objects;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Objects.compare(o1.getPrice(), o2.getPrice(), Integer::compareTo);
    }
}