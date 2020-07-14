package decomposition;

/*Модуль 2    Декомпозиция с использованием методов  5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов). */

public class Task6 {

    private static void nod(int a, int b, int c) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        while (c != 0) {
            int temp = a % c;
            a = c;
            c = temp;
        }
        if (a == 1)
            System.out.println("simple");
        else
            System.out.println(" not simple");

    }

    public static void main(String[] args) {
        nod(5, 10, 19);

    }
}
