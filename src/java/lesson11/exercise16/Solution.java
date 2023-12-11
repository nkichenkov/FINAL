package java.lesson11.exercise16;

/*
Условие задачи:
Метод получает на вход 5 оценок по 5-бальной шкале. Вывести строку типа - отличник, хорошист, троечник или двоечник
исходя из среднего арефметического этих значений. Без округлений
 */

public class Solution {
    public static void main(String[] args) {
        check(5, 5, 5, 5, 5);
        check(3, 5, 4, 2, 4);
        check(3, 2, 4, 2, 3);
        check(4, 4, 5, 4, 3);
        check(4, 4, 5, 4, 4);
    }

    private static void check(int a, int b, int c, int d, int e) {
        double result = (a + b + c + d + e) / 5.0;
        if (result == 5) {
            print(result + " Отличник");
        } else if (result >= 4) {
            print(result + " Хорошист");
        } else if (result >= 3) {
            print(result + " Троечник");
        } else {
            print(result + " Двоечник");
        }
    }

    private static void print(Object x) {
        System.out.println(x);
    }
}
