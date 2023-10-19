package by.bsuir.lab1.task10;

import by.bsuir.lab1.task9.Ball;
import by.bsuir.lab1.task9.Basket;

import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Random rnd = new Random();
        int ballsCount = rnd.nextInt(10, 100);
        Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.ORANGE, Color.PINK, Color.MAGENTA};
        for (int i = 0; i < ballsCount; i++) {
            basket.add(new Ball(colors[rnd.nextInt(colors.length)], rnd.nextDouble(100.0)));
        }
        System.out.printf("Basket weight: %.2f\n", basket.getWeight());
        System.out.printf("Blue balls count: %d\n", basket.countColor(Color.BLUE));
    }
}
