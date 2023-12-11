package lesson14.exercise10;

/*
Условие задачи:
Метод принимает массив на вход и отдает новый массив где первым элементом является сумма первого и последнего.
Для второго элемента сумма второго и предпоследнего
 */

public class Solution {
    public static void main(String[] args) {
        int[] newArray = showArray(new int[]{1, 2, 3, 4, 3, 2, 1});
        for (int number : newArray) {
            print(number);
        }
    }

    private static int[] showArray(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] + array[array.length - 1 - i];
        }
        return result;
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}