package lesson15.exercise04;

import java.util.Scanner;

/*
Условие задачи:
Пишем чатбота для устройства на работу. Вопросы придумайте сами и условия тоже. Для примера вам нужно спросить кандидата
о знаниях тех или иных технологий и опыте работы. Если все подходит - вывести - вы приняты на работу, иначе - отказано
 */

public class Solution {

    private static final String EDUCATION = "Оконченное высшее";
    private static final int OLD_MAX = 28;
    private static final String DENIED = "Извините, в этот раз мы вам откажем";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Добрый день! В связи с большой загрузкой, собеседование проведет наш чат бот. Он задаст вам несколько " +
                "вопросов, пожалуйста, ответьте на них. Какое у вас образование?");
        String education = scanner.nextLine();
        print("Сколько вам полных лет?");
        int old = scanner.nextInt();
        print("Какой у вас опыт работы с ПК? (укажите количество лет)");
        int question = scanner.nextInt();
        if ((!(education.equals(EDUCATION))) || (old > OLD_MAX || old < 18) || (question < 2)) {
            print(DENIED);
        } else {
            print("Поздравляем вас с успешным прохождением собеседования. Наш менеджер свяжется с вами!");
        }
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
