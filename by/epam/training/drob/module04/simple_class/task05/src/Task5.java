/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
        на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
        произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
        позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/


public class Task5 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.showCounter();
        System.out.println("Second counter");
        Counter counterSecond =new Counter(10,11,10);
        counterSecond.increaseValue();
        counterSecond.showCounter();
        counterSecond.increaseValue();
        counterSecond.showCounter();
    }
}
