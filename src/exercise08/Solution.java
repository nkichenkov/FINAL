package exercise08;

/*
Условие задачи:
Получаем на вход число - возраст человека. Если он старше 18, то даем доступ к контенту (просто вывести строку в консоль)
Но если число неадекватно (придумайте проверку), то выводим - вы бот.
 */

public class Solution {

    public static void main(String[] args) {
        age(18);
        age(16);
        age(-2);
        age(532);
    }

    private static void age(int a) {
        if (a <= 0 || a > 130) {
            print("Бот детектед");
        } else {
            if (a >= 18) {
                print("Доступ разрешен");
            } else {
                print("Повторите попытку");
            }
        }
    }

    private static void print(String x) {
        System.out.println(x);
    }
}