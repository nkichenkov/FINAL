package java.lesson18.exercise03;

public class Lesson {

    final boolean finish;

    final int number;

    public Lesson(boolean finish, int number) {
        this.finish = finish;
        this.number = number;
        System.out.println("Lesson number: " + this.number + ", completed:" + this.finish);
    }
}
