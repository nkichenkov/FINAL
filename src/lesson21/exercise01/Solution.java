package lesson21.exercise01;

public class Solution {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(2);
        figures[1] = new Rectangle(5, 6);
        figures[2] = new Triangle(3, 4, 5);

        for (Figure figure : figures) {
            print(figure.toString());
        }
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}