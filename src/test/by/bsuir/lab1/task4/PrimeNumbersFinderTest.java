package by.bsuir.lab1.task4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersFinderTest {

    @Test
    void find_NoPrimes() {
        List<Integer> numbers = Arrays.asList(6, 90, 46, 1080, 12345678);
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = PrimeNumbersFinder.find(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void find_WithPrimes() {
        List<Integer> numbers = Arrays.asList(12, 5, 3571, 1080, 90132844, 131071);
        List<Integer> expected = Arrays.asList(1, 2, 5);
        List<Integer> actual = PrimeNumbersFinder.find(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void find_BigPrimes(){
        List<Integer> numbers = Arrays.asList(524287, 2147483647, 213097498, 9369319);
        List<Integer> expected = Arrays.asList(0, 1, 3);
        List<Integer> actual = PrimeNumbersFinder.find(numbers);
        assertEquals(expected, actual);
    }
}