package exercise04;

/*
Условие задачи:
Метод получает 3 числа на вход и проверяет - существует ли такой треугольник или нет
(он существует если сумма любых 2 сторон больше третьей)
 */

public class Solution {
    public static void main(String[] args) {
        print(treugolnic(3,4,5));
        print(treugolnic(1,2,3));
        print(treugolnic(3,-4,5));
    }

    public static boolean treugolnic (int a, int b, int c){
        return a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a;
    }
    public static void print (boolean x){
        System.out.println(x);
    }
}
