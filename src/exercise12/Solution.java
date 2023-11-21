package exercise12;

/*
Условие задачи:
Проверяем состояние воды. На вход получаем одно число и в зависимости от него выводи в консоль агрегатное состояние -
лед, вода или пар
 */

public class Solution {
    public static void main(String[] args) {
        check(-1);
        check(10);
        check(102);
    }

    private static void check (int a){
        if (a > 0 && a < 100){
            print("Вода");
        } else if (a < 0) {
            print("Лёд");
        } else {
            print("Пар");
        }
    }

    private static void print (String x){
        System.out.println(x);
    }
}
