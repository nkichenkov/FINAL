package java.lesson13.exercise05;

/*
Условие задачи:
Написать метод, который принимает массив строк и проверяет сколько в них пустых строк
 */

public class Solution {
    public static void main(String[] args) {
        print(emptyStringCount(new String[]{"a", "", "sd", ""}));
        print(emptyStringCount(new String[]{""}));
        print(emptyStringCount(new String[]{" "}));
        print(emptyStringCount(new String[]{}));
    }

    private static int emptyStringCount(String[] array) {
        int count = 0;
        if (array.length < 1) {
            print("array is empty");
            count = -1;
        } else {
            for (String string : array) {
                if (string.isEmpty()) {
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
