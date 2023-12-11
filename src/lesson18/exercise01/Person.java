package lesson18.exercise01;

public class Person {
    final String name;
    final String surname;
    final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        System.out.println(this.name + " " + this.surname + ", " + this.age);
    }
}
