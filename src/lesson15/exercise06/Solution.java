package lesson15.exercise06;

import java.util.Scanner;

/*
Условие задачи:
Пишем полноценного бота который имеет какое-то количество комманд и может выдать какую-то информацию по ним. На любой
ввод который не подпадает под команды выдаем список возможных комманд с предложением - извините, но такой команды нет.
Вот список того, что вы можете узнать. Добавить выхода и при ее вводе выйти из программы
 */

public class Solution {

    private static final CommandAndResult[] COMMAND_AND_RESULTS = new CommandAndResult[]{
            new CommandAndResult("/help", ""),
            new CommandAndResult("/start", "Bor started!"),
            new CommandAndResult("/getLocation", "location is Moscow"),
            new CommandAndResult("/end", "Bot ended")
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commands = "commands available for this bot";
        for (CommandAndResult item : COMMAND_AND_RESULTS) {
            commands += item.command;
        }
        COMMAND_AND_RESULTS[0] = new CommandAndResult(COMMAND_AND_RESULTS[0].command, commands);

        String input;
        boolean found;
        while (true) {
            input = scanner.nextLine();
            found = false;
            for (int i = 0; i < COMMAND_AND_RESULTS.length; i++) {
                if (COMMAND_AND_RESULTS[i].command.equals(input)) {
                    print(COMMAND_AND_RESULTS[i].result);
                    found = true;
                    break;
                }
            }
            if (COMMAND_AND_RESULTS[COMMAND_AND_RESULTS.length - 1].command.equals(input)) {
                break;
            }
            if (!found) {
                print("no command found for that input. Try ryping " + COMMAND_AND_RESULTS[0].command);
            }
        }
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}
