package exercise19;

/*
Условие задачи:
Прямоугольник или квадрат. На входе 4 числа. Решить, это квадрат или прямоугольник или же простой четырехугольник
 */

public class Solution {
    public static void main(String[] args) {
        isRectangle(5,5,5,5);
        isRectangle(5,6,5,6);
        isRectangle(5,4,5,6);
    }

    private static void isRectangle (int a, int b, int c, int d) {
        if (a>0 && b>0 && c>0 && d>0) {
            if (a == b && b == c && c == d) {
                print("Квадрат");
            } else if ((a == b && c == d) || (b == d && a == c) || (a == d && b == c)) {
                print("Прямоугольник");
            } else {
                print("Четырехугольник");
            }
        }
    }

    private static void print (String x){
        System.out.println(x);
    }
}
