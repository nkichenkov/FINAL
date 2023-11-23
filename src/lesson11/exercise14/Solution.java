package lesson11.exercise14;

/*
Условие задачи:
Сравним строки. 2 строки на вход. Отдаем true только если обе строки не пустые и равны друг другу
 */

public class Solution {
    public static void main(String[] args) {
        print(check("one", "two"));
        print(check("", ""));
        print(check("", "two"));
        print(check("one", ""));
        print(check("one", "one"));
    }

    private static boolean check(String a, String b) {
        return !a.isEmpty() && !b.isEmpty() && a.equals(b);
    }

    private static void print(Boolean x) {
        System.out.println(x);
    }
}
