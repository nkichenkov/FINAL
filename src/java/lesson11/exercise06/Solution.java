package java.lesson11.exercise06;

/*
Условие задачи:
Метод получает на вход параметр булеан типа - сегодня выходной или нет, и сегодня праздник или нет. И если нам надо
на работу (в выходные и в праздники не надо) то у нас звонит будильник в 6 утра. Можете усложнить еще так - если
просто выходной, то будильник на 11 утра. Но если праздник и выходной совпали, то не надо будильников как и в любой
праздничный день
 */

public class Solution {

    public static void main(String[] args) {
        today(true, true);
        today(true, false);
        today(false, true);
        today(false, false);
    }

    private static void today(boolean isDayOff, boolean isHoliday) {
        if (isDayOff && isHoliday) {
            print("Будильников не надо. Отдыхай");
        } else if (isHoliday) {
            print("Будильников не надо");
        } else if (isDayOff) {
            print("Звонит будильник в 11 утра");
        } else {
            print("Будильник в 6 утра");
        }
    }

    private static void print(String x) {
        System.out.println(x);
    }
}
