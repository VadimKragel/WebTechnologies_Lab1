package by.bsuir.lab1.task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionTableTest {

    private List<List<Double>> getExpected(Double from, Double to, Double step) {
        List<List<Double>> expected = new ArrayList<>();
        for (Double d = from; d <= to; d += step) {
            expected.add(new ArrayList<>(Arrays.asList(d, Math.tan(d))));
        }
        return expected;
    }

    @Test
    void calculate_FromMinusPiToPi() {
        double from = -Math.PI;
        double to = Math.PI;
        double step = Math.PI / 4;
        List<List<Double>> expected = getExpected(from, to, step);
        List<List<Double>> actual = FunctionTable.calculate(from, to, step);
        System.out.println(FunctionTable.pointsToString(expected));
        System.out.println(FunctionTable.pointsToString(actual));
        assertEquals(expected, actual);
    }

    @Test
    void calculate_PositivePart() {
        double from = 2;
        double to = 100;
        double step = 0.1;
        List<List<Double>> expected = getExpected(from, to, step);
        List<List<Double>> actual = FunctionTable.calculate(from, to, step);
        System.out.println(FunctionTable.pointsToString(expected));
        System.out.println(FunctionTable.pointsToString(actual));
        assertEquals(expected, actual);
    }

    @Test
    void calculate_NegativePart() {
        double from = -100;
        double to = -40;
        double step = 0.15;
        List<List<Double>> expected = getExpected(from, to, step);
        List<List<Double>> actual = FunctionTable.calculate(from, to, step);
        System.out.println(FunctionTable.pointsToString(expected));
        System.out.println(FunctionTable.pointsToString(actual));
        assertEquals(expected, actual);
    }

    @Test
    void calculate_SegmentWithBigBoundsValues() {
        double from = -10E6;
        double to = 10E7;
        double step = 10;
        List<List<Double>> expected = getExpected(from, to, step);
        List<List<Double>> actual = FunctionTable.calculate(from, to, step);
        assertEquals(expected, actual);
    }
}