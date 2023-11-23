package lesson11.exercise18;

/*
Условие задачи:
Пишем метод модуля. Если входной аргумент числа больше нуля, то вернуть его же, если же меньше нуля, то вернуть это число
без знака минус. Если это ноль, то вывести в консоль строку - это ноль и вернуть ноль
 */

public class Solution {
    public static void main(String[] args) {
        print(check(-5));
        print(check(6));
        print(check(0));
    }

    private static int check(int a) {
        if (a > 0) {
            return a;
        } else if (a < 0) {
            return (a * (-1));
        } else {
            return a;
        }
    }

    private static void print(int x) {
        System.out.println(x);
    }
}
