package lesson14.exercise02;

/*
Условие задачи:
Метод выводит все числа кратные числу, которое передаем в аргументе
 */

public class Solution {
    public static void main(String[] args) {
        showDiff(10, 4);
    }

    private static void showDiff(int max, int num) {
        for (int i = 0; i < max; i += num) {
            print(i);
        }
    }

    private static void print(int x) {
        System.out.println(x);
    }
}
