package lesson13.exercise01;

/*
Условие задачи:
Написать метод, который найдет минимум из любого количества чисел (аргумент массив)
 */

public class Solution {
    public static void main(String[] args) {
        print(minNumber(new int[]{1}));
        print(minNumber(new int[]{2, 1, -1, 5, -3, 50}));
    }

    private static int minNumber(int[] numbers) {
        int min;
        if (numbers.length == 0) {
            print("Empty array!");
            min = 0;
        } else {
            min = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }
        return min;
    }

    private static void print(int x) {
        System.out.println(x);
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
