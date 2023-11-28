package lesson21.exercise01;

public abstract class Figure {

    final String type;
    protected final double[] sides;

    protected Figure(double[] sides) {
        this.type = getClass().getSimpleName();
        this.sides = sides;
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

    public abstract double getArea();

    public double getPerimeter() {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    public String toString() {
        return getType() + " - area: " + getArea() + ", perimeter: " + getPerimeter();
    }

}
