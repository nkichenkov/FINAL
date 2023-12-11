package lesson20.exercise02;

public class Solution {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0, 3),
                new Point(4, 0),
                new Point(0, 0));
        System.out.println(triangle.isRightTriangle());
    }
}
