package lesson29.exercise08;

/*
Написать класс SafeList который имлементирует интерфейс List и делает все вызовы методов безопасными. Так же не даем
класть в список null и дубликаты жлементов. При попытке получить жлемент с индексом больше чем размер списка отдаем
null. Т.е. стараемся сделать так, чтобы при работе с этим классом не возникло ни одной ошибки.
 */

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        SafeList<String> list = new SafeList<>(new ArrayList<>());
        list.add("a");
        list.add("a");
        list.add(null);

        list.add(-2, null);
        list.add(5, null);
        list.add(1, null);

        list.set(-2, null);
        list.set(5, null);
        list.set(1, null);

        list.set(0, "b");

        String s = list.get(10);
        System.out.println(s == null);

        for (String str : list)
            System.out.println(str);
    }
}
