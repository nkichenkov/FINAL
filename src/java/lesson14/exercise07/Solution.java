package java.lesson14.exercise07;

/*
Условие задачи:
Вывести индекс элемента массива который равен строке "this", если их несколько, то через запятую
 */

public class Solution {
    public static void main(String[] args) {
        showIndex(new String[]{"a", "b", "this", "2", "this", "this"});
        showIndex(new String[]{"a", "b", "this", "2"});
    }

    private static void showIndex(String[] array) {
        if (array.length == 0) {
            print("Empty array");
        } else {
            String indexes = "";
            for (int i = 0; i < array.length; i++) {
                if ("this".equals(array[i])) {
                    if (!indexes.isEmpty()) {
                        indexes += ", ";
                    }
                    indexes += i;
                }
            }
            print(indexes);
        }
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
