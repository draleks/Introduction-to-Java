package array;

/*Модуль 2    Одномерные массивы    5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.*/

public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 8, 9, 5, 2};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i + 1) {
                System.out.println(array[i]);
            }
        }
    }
}
