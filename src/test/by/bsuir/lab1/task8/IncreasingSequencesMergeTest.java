package by.bsuir.lab1.task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingSequencesMergeTest {

    @Test
    void findIndexes_NonEmptyLists() {
        List<Double> first = Arrays.asList(1.3, 2d, 6.7, 10.6, 20.9);
        List<Double> second = Arrays.asList(2.2, 6.8, 8.8, 16.7, 30.3);
        List<Integer> expected = Arrays.asList(2, 3, 3, 4, 5);
        List<Integer> actual = IncreasingSequencesMerge.findIndexes(first, second);
        assertEquals(expected, actual);
    }

    @Test
    void findIndexes_FirstEmpty() {
        List<Double> first = new ArrayList<>();
        List<Double> second = Arrays.asList(2.2, 6.8, 8.8, 16.7, 30.3);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> actual = IncreasingSequencesMerge.findIndexes(first, second);
        assertEquals(expected, actual);
    }

    @Test
    void findIndexes_AllSecondBeforeFirst() {
        List<Double> first = Arrays.asList(1.3, 2d, 6.7, 10.6, 20.9);
        List<Double> second = Arrays.asList(-5d, -1.3, 0d, 0.05);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0);
        List<Integer> actual = IncreasingSequencesMerge.findIndexes(first, second);
        assertEquals(expected, actual);
    }

    @Test
    void findIndexes_AllSecondAfterFirst() {
        List<Double> first = Arrays.asList(-5d, -1.3, 0d, 0.05);
        List<Double> second = Arrays.asList(1.3, 2d, 6.7, 10.6, 20.9);
        List<Integer> expected = Arrays.asList(4, 4, 4, 4, 4);
        List<Integer> actual = IncreasingSequencesMerge.findIndexes(first, second);
        assertEquals(expected, actual);
    }
}