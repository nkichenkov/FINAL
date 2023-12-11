package java.lesson13.exercise04;

/*
Условие задачи:
Написать метод, который принимает на вход число и массив. Вывести, сколько раз в этом массиве встречается это число
которое передали в аргументе
 */
public class Solution {
    public static void main(String[] args) {
        print(countNumber(4, new int[]{-1, 3, -2, 4}));
        print(countNumber(1, new int[]{1, 3, -2, 4, 1}));
        print(countNumber(6, new int[]{1, 3, 2, 4}));
        print(countNumber(90, new int[]{}));
    }

    public static int countNumber(int number, int[] array) {
        int count = 0;
        if (array.length == 0) {
            print("Empty array!");
            count = 0;
        } else {
            for (int num : array) {
                if (num == number) {
                    count++;
                }
            }
        }
        return count;
    }

    private static void print(int x) {
        System.out.println(x);
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
