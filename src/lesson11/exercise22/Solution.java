package lesson11.exercise22;

/*
Условие задачи:
Предположим у первого игрока преимущество и он может делать 2 хода подряд, тогда как второй игрок может делать лишь
1 ход. Написать метод, который проверит кто его вызывает и выводить в консоль только те ходы которые разрешены тем
или иным игроком
 */

public class Solution {

    private static int GAMER1 = 1;
    private static int GAMER1steps = 0;
    private static int GAMER2 = 1;

    public static void main(String[] args) {
        check(1, "step1");
        check(1, "step2");
        check(2, "step3");
        check(2, "step4");
        check(1, "step5");
    }

    private static void check(int gamer, String step) {
        if (gamer == GAMER1) {
            if (gamer == 1) {
                if (GAMER1steps == 0) {
                    GAMER1steps++;
                    print(step);
                } else if (GAMER1steps == 1) {
                    GAMER1steps = 0;
                    print(step);
                    GAMER1 = 2;
                }
            } else {
                print(step);
                GAMER1 = 1;
            }
        }
    }

    private static void print(String x) {
        System.out.println(x);
    }
}