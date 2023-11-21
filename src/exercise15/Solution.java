package exercise15;

/*
Условие задачи:
Проверяем строку на урл. Проверить, что строка начинается с 'http://'. Метод для проверки найдите сами -
угадать можно число логически, просто напишите точку после строки и среда разработки предложит методы
 */

public class Solution {
    public static void main(String[] args) {
        print(check("www.google"));
        print(check("http://www.google"));
    }

    private static boolean check(String x) {
        return x.startsWith("http://");
    }

    private static void print(Boolean a) {
        System.out.println(a);
    }
}
