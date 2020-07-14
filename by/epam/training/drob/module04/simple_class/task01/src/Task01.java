/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение
 * из этих двух переменных.
 */
public class Task01 {
    public static void main(String[] args) {
        Test1 test1 = new Test1(4,9);
        System.out.println(test1.sum());
        System.out.println(test1.maxValue());
        test1.setA(29);
        test1.print();

    }
}

