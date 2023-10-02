package by.bsuir.lab1.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionTest {

    @Test
    void evaluate_SmallInts() {
        int x = 1;
        int y = 5;
        double expected = 1.36881;
        double actual = Expression.evaluate(x, y);
        assertEquals(expected, actual, 1E-5);
    }

    @Test
    void evaluate_BigYValue() {
        double x = 1373.512;
        double y = 967_763_908_547.087;
        double expected = 1373.51337;
        double actual = Expression.evaluate(x, y);
        assertEquals(expected, actual, 1E-5);
    }

    @Test
    void evaluate_BigXValue() {
        double x = 1_567_390_707_765.512;
        double y = 96776.087;
        double expected = 1_567_390_707_765.511963;
        double actual = Expression.evaluate(x, y);
        assertEquals(expected, actual, 1E-5);
    }

    @Test
    void evaluate_NegativeDoubles() {
        double x = -3.284;
        double y = -4.987;
        double expected = -2.93493;
        double actual = Expression.evaluate(x, y);
        assertEquals(expected, actual, 1E-5);
    }

    @Test
    void evaluate_Zeros() {
        double x = 0;
        double y = 0;
        double expected = 0.5;
        double actual = Expression.evaluate(x, y);
        assertEquals(expected, actual);
    }
}