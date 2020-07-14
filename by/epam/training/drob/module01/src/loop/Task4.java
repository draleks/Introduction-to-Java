package loop;

/*Модуль 1. Циклы    4. Составить программу нахождения произведения квадратов первых двухсот чисел. */

public class Task4 {
    public static void main(String[] args) {
        long sum = 1;
        int i = 1;
        while (sum < Long.MAX_VALUE / i) {
            sum *=i * i;
            i++;
        }
        System.out.println("sum= " + sum);
        System.out.println("i= " + i);
    }
}
