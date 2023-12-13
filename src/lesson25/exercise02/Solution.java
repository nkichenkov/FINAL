package lesson25.exercise02;

/*
За основу взять задачу из прошлой лекции.
Помните работников? Пусть будет абстрактный класс работника который может работать с какими-то задачами и у этого класса
наследники Программист, Дизайнер и Тестировщик. Каждый класс сам решает как выполнять задачи. Написать класс задача
и наследников 3 для него. Связать класс работника с классом задачи (оба абстрактные вместо просто Т напишете этот класс)
и в методе выполнить задачу заюзаете его. И чтобы усложнить это задание, пусть например дизайнер не только выполняет
задачи, но и порождает их.
* супер усложнение для тех кто хочет - пусть будет класс собирающий экстразадания а-ля фабрика задач и распределяющий
задачи по их типу.
 */

public class Solution {

    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new CallbackImpl(factory);
        EmployeeChain chain = new EmployeeChain(new EmployeeChain(new Designer(callback, "Alycia"),
                new Programmer(callback, "John")),
                new Tester(callback, "Steve"));

        while (true)
            if (!chain.doTask(factory.getTask()))
                break;
    }
}
