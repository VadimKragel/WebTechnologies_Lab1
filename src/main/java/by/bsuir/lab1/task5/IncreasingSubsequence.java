package by.bsuir.lab1.task5;

import java.util.List;

public class IncreasingSubsequence {
    private IncreasingSubsequence(){}

    public static int countDeletedElements(List<Integer> numbers){
        if (numbers.isEmpty()){
            return 0;
        }
        int size = numbers.size();
        int[] indexes = new int[size + 1];
        int length = 0, low, high, mid;
        for (int i = 0; i < size; i++) {
            low = 1;
            high = length;
            while(low <= high) {
                mid = (low + high) / 2;
                if (numbers.get(indexes[mid]) < numbers.get(i))
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            indexes[low] = i;
            if (low > length){
                length = low;
            }
        }
        return size - length;
    }
}
