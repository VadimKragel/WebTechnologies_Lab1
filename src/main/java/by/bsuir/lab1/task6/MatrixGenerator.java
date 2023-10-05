package by.bsuir.lab1.task6;

public class MatrixGenerator {
    private MatrixGenerator() { }

    public static double[][] generate(double[] row){
        int size = row.length;
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = row[(i + j) % size];
            }
        }
        return matrix;
    }
}
