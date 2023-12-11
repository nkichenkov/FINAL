package lesson14.exercise08;

/*
Условие задачи:
Метод принимает массив чисел на вход и отдает на выход массив тех же чисел, но заменив отрицательные положительными.
Нули не трогать
 */

public class Solution {
    public static void main(String[] args) {
        int[] newArray = abs(new int[]{9, -1, 2, -5, -6, 0, 2});
        for (int number : newArray) {
            print(number);
        }
    }

    private static int[] abs(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] > 0 ? array[i] : array[i] * (-1);
        }
        return result;
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
