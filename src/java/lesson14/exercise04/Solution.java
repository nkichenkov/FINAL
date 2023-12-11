package java.lesson14.exercise04;

/*
Условие задачи:
Найти минимум и максимум в массиве и вывести разницу
 */

public class Solution {

    public static void main(String[] args) {
        print(differenceBetweenMaxAndMin(new int[]{5, 3}));
        print(differenceBetweenMaxAndMin(new int[]{15, 2, 10, -3, 1, -13}));
    }

    private static int differenceBetweenMaxAndMin(int[] array) {
        int difference = 0;
        if (array.length < 2) {
            print("array doesn`t contain at least 2 items");
        } else {
            final int item0 = array[0];
            final int lastItem = array[array.length - 1];

            boolean isFirstItemMin = item0 < lastItem;
            int min = isFirstItemMin ? item0 : lastItem;
            int max = isFirstItemMin ? lastItem : item0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                } else if (array[i] > max) {
                    max = array[i];
                }
            }
            difference = max - min;
        }
        return difference;
    }


    private static void print(Object o) {
        System.out.println(o);
    }
}