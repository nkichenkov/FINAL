package lesson13.exercise03;

/*
Условие задачи:
Написать метод, который посчитает количество отрицательных чисел в массиве
 */

public class Solution {
    public static void main(String[] args) {
        print(countNumber(new int[]{-1, 3, -2, 4}));
        print(countNumber(new int[]{1, 3, -2, 4}));
        print(countNumber(new int[]{1, 3, 2, 4}));
        print(countNumber(new int[]{}));
    }

    private static int countNumber(int[] array) {
        int counter = 0;
        if (array.length == 0) {
            print("Empty array!");
            counter = 0;
        } else {
            for (int number : array) {
                if (number < 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static void print(int x) {
        System.out.println(x);
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
