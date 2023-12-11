package java.lesson13.exercise02;

/*
Условие задачи:
Написать метод, который перемножит все числа в массиве
 */

public class Solution {

    public static void main(String[] args) {
        print(multiplicationNumbers(new int[]{3, 5}));
        print(multiplicationNumbers(new int[]{2, 1, -1, 5, -3, 50}));
    }

    private static int multiplicationNumbers(int[] number) {
        int result;
        if (number.length == 0) {
            print("Empty array!");
            result = 0;
        } else {
            result = 1;
            for (int i = 0; i < number.length; i++) {
                result *= number[i];
            }
        }
        return result;
    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static void print(int x) {
        System.out.println(x);
    }
}
