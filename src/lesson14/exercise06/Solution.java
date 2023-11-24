package lesson14.exercise06;

/*
Условие задачи:
Вывести в обратном порядке члены массива (метод принимает аргументом массив)
 */

public class Solution {
    public static void main(String[] args) {
        showItemsReverted(new int[]{1, 2, 3});
    }

    private static void showItemsReverted(int[] array) {
        if (array.length == 0) {
            print("Empty array");
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                print(array[i]);
            }
        }
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}