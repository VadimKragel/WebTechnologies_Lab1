package by.bsuir.lab1.task9;

import org.junit.jupiter.api.RepeatedTest;

import java.awt.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketTest {

    @RepeatedTest(10)
    void countColor_RandomColors() {
        Basket basket = new Basket();
        Random rnd = new Random();
        int ballsCount = rnd.nextInt(100, 1000);
        double expected = 0;
        Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.ORANGE, Color.PINK, Color.MAGENTA};
        Color countedColor = colors[rnd.nextInt(colors.length)];
        Color color;
        for (int i = 0; i < ballsCount; i++) {
            color = colors[rnd.nextInt(colors.length)];
            basket.add(new Ball(color, rnd.nextDouble(100.0)));
            if (color == countedColor) {
                expected++;
            }
        }
        double actual = basket.countColor(countedColor);
        assertEquals(expected, actual);
    }

    @RepeatedTest(10)
    void getWeight_RandomWeights() {
        Basket basket = new Basket();
        Random rnd = new Random();
        int ballsCount = rnd.nextInt(100, 1000);
        double expected = 0;
        double weight;
        for (int i = 0; i < ballsCount; i++) {
            weight = rnd.nextDouble(100.0);
            basket.add(new Ball(new Color(rnd.nextInt(256)), weight));
            expected += weight;
        }
        double actual = basket.getWeight();
        assertEquals(expected, actual);
    }
}