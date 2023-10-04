package by.bsuir.lab1.task4;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersFinder {
    private PrimeNumbersFinder() {
    }

    private static boolean IsPrime(Integer number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> find(List<Integer> numbers) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (IsPrime(numbers.get(i))) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
