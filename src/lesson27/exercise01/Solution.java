package lesson27.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        List<Employee> employees = new ArrayList<>();
        TaskProgressCallback callback = new CallbackImpl(factory);
        employees.add(new Designer(callback, "Alicya"));
        employees.add(new Programmer(callback, "John"));
        employees.add(new Tester(callback, "Steve"));
        factory.addEmployees(employees);
        factory.start();
    }
}
