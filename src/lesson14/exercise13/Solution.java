package lesson14.exercise13;

/*
Условие задачи:
Метод принимает 2 массива чисел и выводит новый массив, где каждый член массива это произведение членов соответственно
т.е. {1, 2, 3};{4, 5, 6} -> {4, 10, 18}
 */

public class Solution {
    public static void main(String[] args) {
        int[] newArray = multiplicationArray(new int[]{1,2,3}, new int[]{4,5,6});
        String text = "";
        for (int number : newArray){
            text += number + " ";
        }
        print(text);
    }

    private static int[] multiplicationArray(int[] a, int[] b) {
        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
                result[i] = a[i] * b[i];
        }
        return result;
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
