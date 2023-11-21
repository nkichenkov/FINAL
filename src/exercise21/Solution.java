package exercise21;

/*
Условие задачи:
Метод принимает 2 аргумента, номер игрока и ход строкой. Храним номер игрока в переменной вне метода. Не даем игроку
сделать ход если он вызывает метод 2 и более раз подряд т.е. как в шашках - 1 ход за раз
 */

public class Solution {

    private static boolean GAMER1 = true;

    public static void main(String[] args) {
        check(1, "step1");
        check(1, "step2");
        check(2, "step3");
        check(2, "step4");
        check(1, "step5");
    }

    private static void check(int numberGamer, String step) {
        if (numberGamer == 1 && GAMER1 ||
                numberGamer == 2 && !GAMER1) {
            print(step);
            GAMER1 = !GAMER1;
        }
    }

    private static void print(String x) {
        System.out.println(x);
    }
}
