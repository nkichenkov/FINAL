package lesson20.exercise01;

public class Rectangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this(a.getDistanceTo(b), a.getDistanceTo(c), b.getDistanceTo(c), c.getDistanceTo(d));
    }

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        if (sideA > 0 && sideB > 0 && sideC > 0 && sideD > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.sideD = sideD;
        } else {
            throw new IllegalArgumentException("Invalid arguments " + sideA + ", " + sideB + ", " + sideC + ", " + sideD);
        }
    }

    public void isRightrectangle() {
        if (sideA == sideB && sideB == sideC && sideC == sideD) {
            System.out.println("Квадрат");
        } else if ((this.sideA == this.sideB && this.sideC == this.sideD) ||
                (this.sideB == this.sideD && this.sideA == this.sideC) ||
                (this.sideA == this.sideD && this.sideB == this.sideC)) {
            System.out.println("Прямоугольник");
        } else {
            System.out.println("Четырехугольник");
        }
    }
}
