package exercise02;

/*
Условие задачи:
Написать метод, который принимает 2 логических переменных isTodayFriday, aLotOfMoney, т.е. сегодня пятница и у вас много денег.
Выведите в консоль следующее:
- если пятница и у вас много денег, то пойти в бар выпить пивка;
- если пятница, но денег немного, то попросить в долг у друга и пойти с ним попить пика;
- во всех остальных случаях (если не пятница и денег нет) пойти домой и поесть гречи
 */

public class Solution {

    public static void main(String[] args) {
        chooseToDrink(true, true);
        chooseToDrink(true, false);
        chooseToDrink(false, true);
        chooseToDrink(false, false);
    }

    private static void chooseToDrink(boolean isTodayFriday, boolean aLotOfMoney) {
        if (aLotOfMoney) {
            print("Пойти в бар выпить пивка");
        } else if (isTodayFriday) {
            print("Попросить в долг у друга и пойти с ним попить пивка");
        } else {
            print("Пойти домой и поесть гречи");
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}