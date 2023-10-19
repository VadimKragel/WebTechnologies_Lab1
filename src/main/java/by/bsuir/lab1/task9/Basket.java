package by.bsuir.lab1.task9;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> balls;

    private double weight;

    public Basket() {
        balls = new ArrayList<>();
        weight = 0;
    }

    public Basket(List<Ball> balls) {
        this();
        for (Ball ball : balls) {
            add(ball);
        }
    }

    public void add(Ball ball){
        balls.add(ball);
        weight += ball.getWeight();
    }

    public int countColor(Color color){
        int count = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == color){
                count++;
            }
        }
        return count;
    }
    public double getWeight() {
        return weight;
    }
}
