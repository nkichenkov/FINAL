package lesson19.exercise01;

/*
Условие задачи:
Написать класс прямоугольника который получает 4 стороны. Добавочный метод является ли он квадратом
 */

public class Solution {
    public static void main(String[] args) {
        boolean valid = Rectangle.areValidArguments(4,1,3,1);
        if(valid){
            Rectangle rectangle = new Rectangle(4,1,3,1);
            rectangle.isRightrectangle();
        }
    }
}
