package exercise05;

/*
Условие задачи:
Метод получает 4 числа на вход и отображает самое меньшее из них
 */

public class Solution {

    public static void main(String[] args) {
        print(min(1, 2, 3, 4));
        print(min(-5, -20, 0, 9));
    }

//    private static int min (int a, int b, int c, int d) { (другой метод решения задачи)
//        int minAB = min(a, b);
//        int minCD = min(c, d);
//        return min(minAB,minCD);
//    }
//
//    private static int min (int a, int b) {
//        return a < b ? a : b;
//    }
//
    private static int min (int a, int b, int c, int d) {
        int min = a;
        if (b < min){
            min = b;
        } else if (c < min){
            min = c;
        } else if (d < min){
            min = d;
        }
        return min;
    }

    public static void print (int x){
        System.out.println(x);
    }
}
