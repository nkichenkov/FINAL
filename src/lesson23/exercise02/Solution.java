package lesson23.exercise02;

/*
Условие задачи:
Напишите метод который принимает строкой аргумент месяца и выдает количество дней в этом месяцу (например за 2021 год)
 */

public class Solution {
    public static void main(String[] args) {
        print(getDaysForMonth("January"));
        print(getDaysForMonth("february"));
    }

    private static String getDaysForMonth(String month) {
        int days;
        switch (month.toLowerCase()) {
            case "january":
            case "январь":
                days = 31;
                break;
            case "february":
                days = 28;
                break;
            default:
                days = 0;
        }
        return month + " has " + days + " days.";
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}