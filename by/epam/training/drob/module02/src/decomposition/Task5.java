package decomposition;

/*Модуль 2    Декомпозиция с использованием методов  5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов). */

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 5, 7, 8, 2, 4, 9, 9};
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i - 1] < array[i]) {
                System.out.println(array[i - 1]);
                break;
            }
        }
    }
}
