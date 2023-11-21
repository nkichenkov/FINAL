package exercise13;

/*
Условие задачи:
Нет ЛГБТ! - написать метод, на вход получаем 2 аргумена. Если пара гетеросексуальная, то выводим в консоль - совет да любовь.
Если же гомосексуальная - то выводим в консоль - уезжайте
 */

public class Solution {
    public static void main(String[] args) {
        checkLGBT(true, true);
        checkLGBT(true, false);
        checkLGBT(false, true);
        checkLGBT(false, false);
    }

    private static void checkLGBT(Boolean a, Boolean b) {
        String result = a != b ? "Совет да любовь" : "Уезжайте";
        print(result);
    }

    private static void print(String x) {
        System.out.println(x);
    }
}
