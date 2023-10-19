package by.bsuir.lab1.task13;

import by.bsuir.lab1.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
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
        if (!super.equals(obj)) {
            return false;
        }
        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        if (level != programmerBook.level) {
            return false;
        }
        if (language == null) {
            return programmerBook.language != null;
        }
        if (!language.equals(programmerBook.language)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 89 * hash + (language != null ? language.hashCode() : 0);
        hash = 89 * hash + this.level;
        return hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{language: \"" + language + "\", level: " + level + "}";
    }
}
