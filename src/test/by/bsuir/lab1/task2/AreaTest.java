package by.bsuir.lab1.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaTest {

    @Test
    void containPoint_PositiveYInArea() {
        double x = 1.6;
        double y = 4.2;
        boolean expected = true;
        boolean actual = Area.containPoint(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void containPoint_PositiveYNotInArea() {
        double x = 1.6;
        double y = 45.5;
        boolean expected = false;
        boolean actual = Area.containPoint(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void containPoint_NegativeYInArea() {
        double x = 5.2;
        double y = -2.4;
        boolean expected = true;
        boolean actual = Area.containPoint(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void containPoint_NegativeYNotInArea() {
        double x = 5.2;
        double y = -3.4;
        boolean expected = false;
        boolean actual = Area.containPoint(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void containPoint_ZeroYInArea() {
        double x = 3.5;
        double y = 0;
        boolean expected = true;
        boolean actual = Area.containPoint(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void containPoint_ZeroYNotInArea() {
        double x = 5.5;
        double y = 0;
        boolean expected = false;
        boolean actual = Area.containPoint(x, y);
        assertEquals(expected, actual);
    }
}