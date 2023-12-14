package lesson29.exercise01;

public class RightTriangleChain extends TriangleChain {

    @Override
    boolean satisfyConditions(Triangle tr) {
        return tr.getSide1() * tr.getSide1() + tr.getSide2() * tr.getSide2() == tr.getSide3() * tr.getSide3() ||
                tr.getSide3() * tr.getSide3() + tr.getSide2() * tr.getSide2() == tr.getSide1() * tr.getSide1() ||
                tr.getSide1() * tr.getSide1() + tr.getSide3() * tr.getSide3() == tr.getSide2() * tr.getSide2();
    }

    @Override
    String getTriangleType() {
        return "Прямоугольный треугольник";
    }

    @Override
    public double calc(Triangle triangle) {
        int biggest = findMax(triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
        double result;
        if (biggest == triangle.getSide1()) {
            result = triangle.getSide2() * triangle.getSide3();
        } else if (biggest == triangle.getSide2()) {
            result = triangle.getSide2() * triangle.getSide3();
        } else {
            result = triangle.getSide1() * triangle.getSide3();
        }
        return 0.5 * result;
    }

    private int findMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}
