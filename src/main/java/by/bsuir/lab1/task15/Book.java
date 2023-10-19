package by.bsuir.lab1.task15;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private long isbn;
    private static int edition;

    public Book(String title, String author, long isbn, int price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 11;
        hash = 61 * hash + (title != null ? title.hashCode() : 0);
        hash = 61 * hash + (author != null ? author.hashCode() : 0);
        hash = 61 * hash + price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        if (price != book.price) {
            return false;
        }
        if (title == null) {
            return book.title != null;
        }
        if (!title.equals(book.title)) {
            return false;
        }
        if (author == null) {
            return book.author != null;
        }
        if (!author.equals(book.author)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{title: \"" + title + "\", author: \"" + author + "\", price: " + price + ", edition: " + edition + "}";
    }

    @Override
    public int compareTo(Book o) {
        return Long.compare(this.isbn, o.isbn);
    }
}
