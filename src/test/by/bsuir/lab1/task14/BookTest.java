package by.bsuir.lab1.task14;

import org.junit.jupiter.api.RepeatedTest;

import java.nio.charset.StandardCharsets;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    private String RandomString() {
        Random rnd = new Random();
        byte[] bytes = new byte[rnd.nextInt(32, 256)];
        rnd.nextBytes(bytes);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    @RepeatedTest(5)
    void testClone_RandomBooks() throws CloneNotSupportedException {
        Random rnd = new Random();
        int count = rnd.nextInt(5, 50);
        for (int i = 0; i < count; i++) {
            Book book = new Book(RandomString(), RandomString(), rnd.nextInt(10000));
            Book clone = book.clone();
            assertEquals(book, clone);
        }
    }
}