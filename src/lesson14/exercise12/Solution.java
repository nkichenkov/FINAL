package lesson14.exercise12;

/*
Условие задачи:
Метод принимает на вход массив чисел и отдает отфильтрованный - т.е. без дубликатов. т.е. {1, 1, 2, 3} -> {1, 2, 3}
 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 2, 3, 3, 3};
        int[] b = new int[a.length];
        int curIndex = 0;
        for (int i : a) {
            if (!contains(b, i)) {
                b[curIndex++] = i;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(b, curIndex)));
    }

    public static boolean contains(int[] a, int num) {
        for (int i : a) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }


}
