package exercise03;

/*
Условие задачи:
Метод принимает 3 числа на вход: стоимость пива, стоимость виски и деньги в кармане
- если денег в кармане хватает на виски, то берем виски;
- если денег в кармане хватает только на пиво, то берем пиво;
- если денег в кармане хватает и на пиво и на виски, то берем и то и другое;
- если у вас ветер в кармане - покидаем бар
 */

public class Solution {

    private static final int BEER = 5;
    private static final int WHISKEY = 9;

    public static void main(String[] args) {
        chooseTake(BEER, WHISKEY, 15);
        chooseTake(BEER, WHISKEY, 10);
        chooseTake(BEER, WHISKEY, 7);
        chooseTake(BEER, WHISKEY, 2);
    }

    public static void chooseTake(int beer, int whiskey, int money) {
        if (money >= beer) {
            if (money >= whiskey) {
                print("Берем виски");
                int rest = money - whiskey;
                if (rest >= beer) {
                    print("Берем пиво");
                }
            } else {
                print("Берем пиво");
            }
        } else {
            print("Покидаем бар");
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
