package java.lesson15.exercise05;

import java.util.Scanner;

/*
Условие задачи:
В консоль вводят 10 чисел последовательно. Проверить что они являются арифметической последовательностью. Выдать что это
не последовательность сразу же, как только вводится неверное число
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 2;
        int last = scanner.nextInt();
        int current = scanner.nextInt();
        final int diff = current - last;

        while (count < 10) {
            last = current;
            current = scanner.nextInt();

            if (diff != current - last) {
                break;
            }
            count++;
        }
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}