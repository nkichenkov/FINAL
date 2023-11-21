package exercise09;

/*
Условие задачи:
Напишите метод, который исходя из входного параметра возраста определит куда ему идти сегодня утром (детсад, школа,
колледж, универ, работа, поликлиника (пенсионеры)). Рамки для возраста придумайте сами. Если же входной параметр
неадекватный - некорректное значение
 */

public class Solution {
    public static void main(String[] args) {
        checkAge(5);
        checkAge(12);
        checkAge(18);
        checkAge(21);
        checkAge(25);
        checkAge(60);
        checkAge(1010);
        checkAge(-100);
    }

    private static void checkAge(int a) {
        if (a < 0 || a > 120) {
            print("Некорректное значение. Повторите ввод.");
        } else {
            if (a > 0 && a <= 7) {
                print("Детсад");
            } else if (a > 7 && a <= 18) {
                print("Школа");
            } else if (a > 18 && a <= 23) {
                print("Универ");
            } else if (a > 23 && a <= 55) {
                print("Работа");
            } else {
                print("Пенсия");
            }
        }
    }

    private static void print(String x) {
        System.out.println(x);
    }
}
