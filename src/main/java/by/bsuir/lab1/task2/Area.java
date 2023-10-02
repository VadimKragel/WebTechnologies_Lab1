package by.bsuir.lab1.task2;

public class Area {
    private Area() { }
    public static boolean containPoint(double x, double y){
        if (y < 0){
            return y > -3 && x > -6 && x < 6;
        } else  {
            return y < 5 && x > -4 && x < 4;
        }
    }
}
