package lesson14.exercise11;

/*
Условие задачи:
Метод принимает на вход массив чисел и отдает на выход массив вдвое больше. Первый и второй элемент нового массива
равны первому элементу первого массива. Третий и четвертый элементы равны второму элементу первого массива.
Типа {1, 2, 3} -> {1, 1, 2, 2, 3, 3}
 */

public class Solution {
    public static void main(String[] args) {
        int[] newArray = doubleArray(new int[]{1, 2, 3, 4});
        String text = "";
        for (int number : newArray) {
            text += number + " ";
        }
        print(text);
    }

    private static int[] doubleArray(int[] array) {
        int[] result = new int[array.length * 2];
        int j = 0;
        for (int i = 0; i < result.length; i += 2) {
            result[i] = array[j];
            result[i + 1] = array[j];
            j++;
        }
        return result;
    }

    private static void print(Object o) {
        System.out.print(o);
    }
}