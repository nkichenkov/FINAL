package lesson27.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("first");
        list.add("second");
        for (String string : list) {
            System.out.println(string);
        }

        list.remove("first");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i " + i + " item " + list.get(i));
        }

        list.add(0, "third");
        list.add("fourth");
        System.out.println("added 2 items");
        list.remove(list.size() - 1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i " + i + " item " + list.get(i));
        }
    }
}
