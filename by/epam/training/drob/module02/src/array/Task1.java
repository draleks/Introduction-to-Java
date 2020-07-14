package array;

/*Модуль 2 Одномерные массивы   1.В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/

public class Task1
{
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 8, 9, 5, 2};
        int k = 2;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
