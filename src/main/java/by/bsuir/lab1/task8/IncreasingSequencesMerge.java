package by.bsuir.lab1.task8;

import java.util.ArrayList;
import java.util.List;

public class IncreasingSequencesMerge {
    private IncreasingSequencesMerge() {}

    public static List<Integer> findIndexes(List<Double> first, List<Double> second){
        List<Integer> indexes = new ArrayList<>();
        int j = 0;
        for (Double valueSecond : second) {
            while (j < first.size() && valueSecond >= first.get(j)) {
                j++;
            }
            indexes.add(j);
        }
        return indexes;
    }
}
