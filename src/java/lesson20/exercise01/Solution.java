package java.lesson20.exercise01;

/*
Условие задачи:
Напишите класс Прямоугольник у которого будет возможность породить объект с помощью точек. Пусть будет private метод
на определение квадрат это или нет и public для описания объекта
 */

public class Solution {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(0, 0),
                new Point(2, 0),
                new Point(2, 3),
                new Point(0, 3));
        rectangle.isRightrectangle();
    }
}
