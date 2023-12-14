package lesson14.exercise05;

/*
Условие задачи:
Найти в массиве повторяющиеся элементы и их количество, т.е. для массива {5, 5, 5, 8, 8} будет 5:3, 8:2
 */

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 2, 2, 2, 1};
        duplicates(array);
    }

    private static void duplicates(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                if (array[i] == array[x] && counter > 0) {
                    counter += 1;
                    array[x] = Integer.MAX_VALUE;
                } else if (array[i] == array[x]) {
                    counter += 1;
                }
            }
            if (array[i] != Integer.MAX_VALUE) {
                System.out.println(array[i] + ":" + counter);
            }
            counter = 0;
        }
    }
}
