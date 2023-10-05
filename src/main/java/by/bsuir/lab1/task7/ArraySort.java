package by.bsuir.lab1.task7;

public class ArraySort {
    private ArraySort() {
    }

    public static void sort(double[] list) {
        double tmp;
        int i = 0;
        while (i < list.length - 1) {
            if (list[i] <= list[i + 1]) {
                i++;
            } else {
                tmp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = tmp;
                if (i > 0) {
                    i--;
                }
            }
        }
    }
}
