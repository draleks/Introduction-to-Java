package decomposition;

/*Модуль 2    Декомпозиция с использованием методов  1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:*/

public class Task1 {
    private static int nod(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private static int nok(int a, int b) {

        return a * b / nod(a, b);
    }

    public static void main(String[] args) {
        System.out.println(nod(25, 20));
        System.out.println(nok(25, 20));

    }
}

