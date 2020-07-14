package array;

/*Модуль 2 Одномерные массивы   2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 7, 8, 9, 5, 2};
        int z = 4;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.println(count);

    }
}
