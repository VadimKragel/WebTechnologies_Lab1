package by.bsuir.lab1.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixGeneratorTest {

    @Test
    void generate_EmptyRow() {
        double[] row = {};
        double[][] expected = {};
        double[][] actual = MatrixGenerator.generate(row);
        assertArrayEquals(expected, actual);
    }

    @Test
    void generate_OneElementRow() {
        double[] row = {1.2};
        double[][] expected = {{1.2}};
        double[][] actual = MatrixGenerator.generate(row);
        assertArrayEquals(expected, actual);
    }

    @Test
    void generate_FourElementsRow() {
        double[] row = {1.124, 0.987, -123.333, 9087};
        double[][] expected = {
                {1.124, 0.987, -123.333, 9087},
                {0.987, -123.333, 9087, 1.124},
                {-123.333, 9087, 1.124, 0.987},
                {9087, 1.124, 0.987, -123.333}
        };
        double[][] actual = MatrixGenerator.generate(row);
        assertArrayEquals(expected, actual);
    }
}