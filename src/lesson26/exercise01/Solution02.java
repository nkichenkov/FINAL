package lesson26.exercise01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution02 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("first");
        list.add("so");
        System.out.println(list.indexOf("first"));
        System.out.println(list.lastIndexOf("first"));

        if (list.size() - 1 >= 4) {
            System.out.println(list.get(4));
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length(); // Сортировка списка по длинне объекта
            }
        });
        for (String string : list) {
            System.out.println(string);
        }
    }
}
