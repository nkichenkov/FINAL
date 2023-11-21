package exercise17;

/*
Условие задачи:
Нет Иванам и Ивановым. Метод на вход получает имя и фамилию по отдельности. Отказать человеку если его зоовут Иван
или же у него фамилия Иванов. А если это прям Иван Иванов, то вывести строку - КОМБО! Для всех других случаев
вывести - Здравствуйте, имя фамилия
 */

public class Solution {
    public static void main(String[] args) {
        checkName("Иван","Иванов");
        checkName("Иван","Сидоров");
        checkName("Николай","Иванов");
        checkName("Николай","Сидоров");
    }

    private static void checkName (String name, String surname){
        if (name.equals("Иван") || surname.equals("Иванов")){
            if (name.equals("Иван") && surname.equals("Иванов")) {
                print("КОМБО-ВОМБО");
            } else {
                print("Досвидания");
            }
        } else {
            print("Здравствуйте " + name + " " + surname);
        }
    }

    private static void print (String x){
        System.out.println(x);
    }
}
