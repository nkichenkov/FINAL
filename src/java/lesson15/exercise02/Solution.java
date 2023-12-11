package java.lesson15.exercise02;

import java.util.Scanner;

/*
Условие задачи:
Для каждого введенного в консоль числа проверять кратно ли оно 5 или нет. Если кратно, то выводить в консоль - кратное 5.
Ограничить ввод 20 числами. (оператор %)
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        while (count < 20) {

            number = scanner.nextInt();

            if (number % 5 == 0) {
                print(number + " кратно 5");
            } else {
                print(number + " не кратно 5");
            }
            count++;
        }
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
