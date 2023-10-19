package by.bsuir.lab1.task16;

import by.bsuir.lab1.task16.comparators.AuthorComparator;
import by.bsuir.lab1.task16.comparators.PriceComparator;
import by.bsuir.lab1.task16.comparators.TitleComparator;

import java.util.Comparator;

public class BookComparators {
    private BookComparators() {
    }

    public static Comparator<Book> getTitleComparator() {
        return new TitleComparator();
    }

    public static Comparator<Book> getTitleAuthorComparator() {
        return new TitleComparator().thenComparing(new AuthorComparator());
    }

    public static Comparator<Book> getAuthorTitleComparator() {
        return new AuthorComparator().thenComparing(new TitleComparator());
    }

    public static Comparator<Book> getAuthorTitlePriceComparator() {
        return new AuthorComparator().thenComparing(new TitleComparator()).thenComparing(new PriceComparator());
    }
}
