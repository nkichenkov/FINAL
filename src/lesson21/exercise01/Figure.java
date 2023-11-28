package lesson21.exercise01;

public abstract class Figure {

    final String type;
    protected final double[] sides;

    protected Figure(String type, double[] sides) {
        this.type = type;
        this.sides = sides;
    }

    public abstract double getArea();

    public double getPerimeter() {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

}
