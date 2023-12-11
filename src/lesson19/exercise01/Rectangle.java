package lesson19.exercise01;

public class Rectangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
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


    public static boolean areValidArguments(int sideA, int sideB, int sideC, int sideD) {
        return sideA > 0 && sideB > 0 && sideC > 0 && sideD > 0;
    }
}