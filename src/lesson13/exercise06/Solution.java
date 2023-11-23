package lesson13.exercise06;

/*
Условие задачи:
Написать метод, который проверит, что числа массива являются арифметической последовательностью
 */

public class Solution {
    public static void main(String[] args) {
        print(checkNumber(new int[]{5, 8, 11, 14, 17}));
        print(checkNumber(new int[]{4, 8, 10, 12}));
    }

    private static boolean checkNumber(int[] numbers) {
        boolean result = true;
        if (numbers.length == 0) {
            print("Empty array");
            result = false;
        } else if (numbers.length > 2) {
            int differece = numbers[1] - numbers[0];
            for (int i = 1; i < numbers.length - 1; i++) {
                int diff = numbers[i + 1] - numbers[i];
                if (diff != differece) {
                    result = false;
                }
            }
        } else {
            print("Little data");
            result = false;
        }
        return result;
    }

    private static void print(boolean x) {
        System.out.println(x);
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
