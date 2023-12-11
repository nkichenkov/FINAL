package java.lesson11.exercise20;

/*
Условие задачи:
Метод анлока урока. На входе номер урока (1 - 100), и булеан - isUserPremium, метод отдает булеан. Если юзер
премиум, то можно выбрать любой урок и пройти его. Если же это первый урок, то его может пройти любой юзер без
разницы какого статуса. Если номер урока выходит за рамки, то отдаем false, и до этого выдаем в консоль строку -
номер невалидный
 */

public class Solution {
    public static void main(String[] args) {
        print(check(1, false));
        print(check(12, true));
        print(check(1, true));
        print(check(13, false));
        print(check(103, true));
    }

    private static boolean check(int lessonNumber, boolean isUserPremium) {
        if (lessonNumber < 1 || lessonNumber > 100) {
            print("Номер урока невалидный");
            return false;
        } else {
            return isUserPremium || lessonNumber == 1;
        }
    }

    private static void print(Boolean x) {
        System.out.println(x);
    }

    private static void print(String x) {
        System.out.println(x);
    }
}
