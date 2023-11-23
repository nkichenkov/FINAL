package lesson15.exercise03;

import java.util.Scanner;

/*
Условие задачи:
Сделать бота для выдачи кредита. Условие кредита - зарплата от 25000 в месяц и срок кредита до 1 года, максимальная
сумма выдачи 150.000 рублей. Или можете придумать свои условия. Главное собрать от юзера данные и обработать их.
В итоге выдать - вам одобрен кредит или же вам отказано
 */

public class Solution {

    private static final int CREDIT_MAX = 150_000;
    private static final int SALARY_MIN = 25_000;
    private static final int DURATION_MAX = 12;
    private static final String DENIED = "Извинте, но вам отказано в кредите";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Добрый день! Желаете взять кредит? Какая у вас зарплата?");
        int salary = scanner.nextInt();
        print("На какой срок вы бы хотели получить кредит (в месяцах)?");
        int duration = scanner.nextInt();
        print("Какую сумму вы бы хотели взять в кредит?");
        int credit = scanner.nextInt();
        if (salary < SALARY_MIN || duration > DURATION_MAX || credit > CREDIT_MAX) {
            print(DENIED);
        } else {
            print("Поздравляем вас! Вам одобрен кредит на сумму " + credit);
        }
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
