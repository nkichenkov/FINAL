package java.lesson18.exercise02;

public class Selectors {
    final int id;

    final String information;


    public Selectors(int id, String information) {
        this.id = id;
        this.information = information;
        System.out.println("id: " + this.id + " " + "info: " + this.information);
    }
}
