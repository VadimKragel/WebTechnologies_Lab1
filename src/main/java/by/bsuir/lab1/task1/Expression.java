package by.bsuir.lab1.task1;

public class Expression {
    private Expression() { }
    public static double evaluate(double x, double y){
        return ((1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x / (1 + x * x * y * y))))) + x;
    }
}