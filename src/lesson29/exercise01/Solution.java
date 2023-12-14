package lesson29.exercise01;

/*
Условие задачи:
Пишем тот же класс треугольника, к нему пишем цепочку с методом в интерфейсе - рассчитать площадь. Первое звено - если
треугольник равносторонний то высчитываем через формулу (а^2 * Math.sqrt(3))/4. Если нет, то одаем другому звену.
Второе звено для равнобедренного треугольника, сначала находим высоту через теорему Пифагора, после уже берем
произведение половины стороны и высоты (0.5 * a * h). Далее звено для прямоугольного треугольника - там просто
половина произведения катетов. Не и последнее звено общая формула которая описана в одной из лекций про треугольник.

Дайте доступ к сторонам треугольника через геттеры для этой задачи чтобы не хранить методы определения типа треугольника.
Или же напишите метод определения типа треугольника в классе треугольника который вернет enum и используйте его, а поля
класса сделайте приватными.

Сначала напишите классическим способом через сеттер следующего звена, после перепишите на метод с интерфейсом и
private final first, second.
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Triangle> triangleList = new ArrayList<>();
        triangleList.add(new Triangle(4, 4, 4));
        triangleList.add(new Triangle(4, 6, 6));
        triangleList.add(new Triangle(3, 4, 5));
        triangleList.add(new Triangle(4, 5, 6));
        triangleList.add(new Triangle(4, 1, 6));
        TriangleChain chain0 = new EquiliteralTriangleChain();
        TriangleChain chain1 = new IsoScelesTriangleChain();
        TriangleChain chain2 = new RightTriangleChain();
        TriangleChain chain3 = new BaseTriangleChain();
        chain2.setNext(chain3);
        chain1.setNext(chain2);
        chain0.setNext(chain1);

        for (Triangle triangle : triangleList)
            System.out.println(chain0.getSquare(triangle));
    }
}
