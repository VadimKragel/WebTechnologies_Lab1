package by.bsuir.lab1.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionTable {
    private FunctionTable() {
    }

    public static List<List<Double>> calculate(Double from, Double to, Double step) {
        List<List<Double>> points = new ArrayList<>();
        for (Double d = from; d <= to; d += step) {
            points.add(new ArrayList<>(Arrays.asList(d, Math.tan(d))));
        }
        return points;
    }

    public static String pointsToString(List<List<Double>> points) {
        String valuesDelim = " | ";
        String pointsDelim = "\n";
        StringBuilder sb = new StringBuilder();
        for (List<Double> point : points) {
            sb.append(pointsDelim);
            StringBuilder pointString = new StringBuilder();
            for (Double value : point){
                pointString.append(valuesDelim).append(String.format("%12.3f", value));
            }
            pointString.delete(0, valuesDelim.length());
            sb.append(pointString);
        }
        sb.delete(0, pointsDelim.length());
        return sb.toString();
    }
}
