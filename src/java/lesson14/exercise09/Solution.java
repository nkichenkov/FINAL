package java.lesson14.exercise09;

/*
Условие задачи:
Метод принимает массив на вход, и отдает новый массив, в котором каждый член это сумма этого числа и следующего.
Последнее число останется таким какое есть
 */

public class Solution {
    public static void main(String[] args) {
        int[] newArray = abs(new int[]{1, 2, 3, 4, 5});
        for (int number : newArray){
            print(number);
        }
    }

    private static int[] abs(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length - 1; i++) {
            result[i] = array[i] + array[i + 1];
        }
        result[result.length - 1] = array[array.length - 1];
        return result;
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
