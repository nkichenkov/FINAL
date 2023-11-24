package lesson15.exercise06;

import java.util.Scanner;

/*
Условие задачи:
Пишем полноценного бота который имеет какое-то количество комманд и может выдать какую-то информацию по ним. На любой
ввод который не подпадает под команды выдаем список возможных комманд с предложением - извините, но такой команды нет.
Вот список того, что вы можете узнать. Добавить выхода и при ее вводе выйти из программы
 */

public class Solution {

    private static final String[] COMMANDS = new String[]{"/help", "/start", "/end", "/getLocation"};
    private static final String[] RESULTS = new String[]{"", "Bot started", "Bot ended", "location is city"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commands = "commands available for this bot: ";
        for (String command : COMMANDS) {
            commands += command + " ";
        }
        RESULTS[0] = commands;

        String input;
        boolean found;
        while (!(input = scanner.nextLine()).equals(COMMANDS[2])) {
            found = false;
            for (int i = 0; i < COMMANDS.length; i++) {
                if (COMMANDS[i].equals(input)) {
                    print(RESULTS[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                print("no command found. Try typing " + COMMANDS[0]);
            }
        }
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
