package by.bsuir.lab1.task5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingSubsequenceTest {

    @Test
    void countDeletedElements_NoDeleted() {
        int expected = 0;
        int actual = IncreasingSubsequence.countDeletedElements(Arrays.asList(1, 3, 12, 1098, 120948));
        assertEquals(expected, actual);
    }

    @Test
    void countDeletedElements_DecreasingSequence() {
        int expected = 6;
        int actual = IncreasingSubsequence.countDeletedElements(Arrays.asList(12235123, 1231, 490, 230, 76, 23, 2));
        assertEquals(expected, actual);
    }

    @Test
    void countDeletedElements_WithDuplicates() {
        int expected = 5;
        int actual = IncreasingSubsequence.countDeletedElements(Arrays.asList(1, 12, 5, 40, 5, 98, 98, 5, 1543, 5));
        assertEquals(expected, actual);
    }
}