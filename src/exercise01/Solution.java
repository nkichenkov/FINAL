package exercise01;

public class Solution {

    public static void main(String[] args) {
        diff(0,0);
        diff(1,0);
        diff(0,2);
    }

    private static void diff(float number1, float number2){
            print(number1/number2);
    }

    private static void print (float number){
        System.out.println(number);
    }
}