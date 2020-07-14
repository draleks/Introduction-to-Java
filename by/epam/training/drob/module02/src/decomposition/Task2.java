package decomposition;

/*Модуль 2    Декомпозиция с использованием методов  2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.*/

public class Task2 {

    private static int nod(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private static int nodFourNumber(int a, int b, int c, int d) {
        int ab = nod(a, b);
        int cd = nod(c, d);
        return nod(ab, cd);
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 90;
        int c = 30;
        int d = 45;
        int result = nodFourNumber(a, b, c, d);
        System.out.println(result);

    }
}
