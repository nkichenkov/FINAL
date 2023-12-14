package lesson29.exercise01;

public abstract class TriangleChain implements Square {

    private TriangleChain next;

    public void setNext(TriangleChain next) {
        this.next = next;
    }

    public double getSquare(Triangle triangle) {
        if (satisfyConditions(triangle)) {
            System.out.println("определен тип треугольника: " + getTriangleType());
            return calc(triangle);
        } else if (next != null) {
            return next.getSquare(triangle);
        } else
            throw new IllegalArgumentException("площадь не была посчитана");
    }

    abstract boolean satisfyConditions(Triangle triangle);

    abstract String getTriangleType();
}
