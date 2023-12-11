package java.lesson11.exercise10;

/*
Условие задачи:
Метод, который не любит Антонов и Денисов. Получаем входной аргумент, если это Антон или Денис, то выводим в консоль -
досвидания. Для всех других имен - добро пожаловать. Можете использовать константу для куска строки
 */

import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        checkName("Антон");
        checkName("Николай");
    }

    private static void checkName(String name) {
        if (Objects.equals(name, "Антон") || Objects.equals(name, "Денис")) {
            print("Вы не проходите");
        } else {
            print("Добро пожаловать");
        }
    }

    private static void print(String x) {
        System.out.println(x);
    }
}
