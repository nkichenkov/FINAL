package lesson29.exercise10;

/*
Написать класс с 2 числовыми полями. Создать список из этих элементов и отсортировать компоратором где пропишем логику
- сначала должны идти те элементы в которых оба числа позитивны, после те в которых оба числа негативны и в конце уже
все остальные.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<MyItem> list = new ArrayList<>();
        list.add(new MyItem(-1, -2));
        list.add(new MyItem(-1, 2));
        list.add(new MyItem(1, 2));
        list.add(new MyItem(1, -2));
        list.add(new MyItem(-3, 4));
        list.add(new MyItem(4, 1));
        list.add(new MyItem(-1, -20));
        list.add(new MyItem(-1, -3));

        list.sort(new Comparator<MyItem>() {
            @Override
            public int compare(MyItem next, MyItem current) {
                return current.sign() - next.sign();
            }
        });
        for (MyItem item : list) {
            System.out.println(item);
        }
    }

    static class MyItem {
        final int i1;
        final int i2;

        MyItem(int i1, int i2) {
            this.i1 = i1;
            this.i2 = i2;
        }

        public int sign() {
            int result;
            if (i1 > 0 && i2 > 0)
                result = 1;
            else if (i1 < 0 && i2 < 0)
                result = 0;
            else
                result = -1;
            return result;
        }

        @Override
        public String toString() {
            return "MyItem{" + "i1=" + i1 + ", i2=" + i2 + '}';
        }
    }
}
