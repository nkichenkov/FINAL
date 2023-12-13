package lesson26.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        List<String> big = new ArrayList<>();
        big.addAll(list);
        for (String string : big) {
            System.out.println(string + " ");
        }
    }
}
