package exercise07;

/*
Условие задачи:
Метод получает на вход 3 числа - значения углов. Исходя из этого проверить его тип - равносторонний, прямоугольный,
равнобедренный, тупоугольный, остроугольный.
 */

public class Solution {

    public static void main(String[] args) {
        check(100, 60, 20);
        check(90, 45, 45);
        check(60, 60, 60);
        check(20, 80, 80);
        check(70, 50, 60);
        check(100, 100, 20);
        check(-1, 200, 0);
        check(60, 61, 20);
    }

    private static void check(int angleA, int angleB, int angleC) {
        String type = " ";
        if (angleA > 0 && angleA < 180 &&
                angleB > 0 && angleB < 180 &&
                angleC > 0 && angleC < 180 &&
                angleA + angleB + angleC == 180) {
            if (angleA == angleB && angleB == angleC) {
                type += "равносторонний ";
            }
            if (angleA == 90 || angleB == 90 || angleC == 90) {
                type += "прямоугольный ";
            }
            if (angleA == angleB || angleA == angleC || angleB == angleC) {
                type += "равнобедренный ";
            }
            if (angleA > 90 || angleB > 90 || angleC > 90) {
                type += "тупоугольный ";
            }
            if (angleA < 90 && angleB < 90 && angleC < 90) {
                type += "остроугольный ";
            }
        } else {
            type = "Невалидные данные";
        }
        print(type);
    }

    private static void print(String x) {
        System.out.println(x);
    }
}
