package java.lesson14.exercise03;

/*
Условие задачи:
Вывести первые n членов последовательности Фиббоначи
 */

public class Solution {
    public static void main(String[] args) {
        showFibbonachi(10);
    }

    private static void showFibbonachi(int max) {
        int item0 = 1;
        int item1 = 1;
        for (int i = 0; i < max; i++) {
            if (i == 0 || i == 1) {
                print(1);
            } else {
                print(item0 + item1);
                int item1Old = item1;
                item1 = item0 + item1;
                item0 = item1Old;
            }
        }
    }

    private static void print(int x) {
        System.out.println(x);
    }
}
