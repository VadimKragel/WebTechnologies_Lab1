package by.bsuir.lab1.task7;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListSortTest {

    @Test
    void sort_MyNumbers() {
        double[] actual = {19, -5.123, 78912.2, 1093.76, -28};
        double[] expected = {-28, -5.123, 19, 1093.76, 78912.2};
        ArraySort.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @RepeatedTest(5)
    void sort_RandomNumbers() {
        Random rnd = new Random();
        int length = rnd.nextInt(20000,100000);
        double[] actual = new double[length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = rnd.nextDouble();
        }
        ArraySort.sort(actual);
        for (int i = 1; i < actual.length; i++) {
            assertTrue(actual[i] > actual[i - 1]);
        }
    }

}