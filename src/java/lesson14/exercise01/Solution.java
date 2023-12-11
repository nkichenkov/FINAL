package java.lesson14.exercise01;

/*
Условие задачи:
Метод выводит все числа кратные 3 от нуля до какого-то числа (входной параметр)
 */
public class Solution {
    public static void main(String[] args) {
        showDiff(10);
    }

    public static void showDiff(int max) {
        for (int i = 0; i < max; i += 3) {
            print(i);
        }
    }

    private static void print(int x) {
        System.out.println(x);
    }
}