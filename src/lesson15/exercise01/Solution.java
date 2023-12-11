package lesson15.exercise01;

import java.util.Scanner;

/*
Условие задачи:
Написать программу, которая будет приветствовать всех, кроме Даниила. т.е. вы вводите имя, программ выдает
"Привет," + введеное имя. До тех пор пока вы не ввели имя Даниил
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String helloText;
        while (!(helloText = scanner.nextLine()).equals("Даниил")) {
            print("Привет " + helloText);
        }
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
