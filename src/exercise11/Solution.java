package exercise11;

/*
Условие задачи:
Метод, который считает количество раз когда его вызывали (private static над методом и мейном), если его вызвали
уже пятый раз и более - вывести в консоль - вы превысили лимит. Иначе же - вывести что-то другое
 */

public class Solution {
    private static int count = 0;

    public static void main(String[] args) {
        check();
        check();
        check();
        check();
        check();
        check();
        check();
    }

    private static void check() {
        if (count < 5) {
            print("Вызов метода");
            count++;
        } else {
            print("Вы превысили лимит");
        }
    }

    private static void print(String x) {
        System.out.println(x);
    }
}
