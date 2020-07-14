package array;

/*Модуль 2    Одномерные массивы   9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.*/

public class Task9 {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 2, 1, 2, 3, 4, 3, 4, 3};
        int value = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            int currentCount = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (currentValue == array[j]) {
                    currentCount++;
                }
                if (currentCount > count) {
                    count = currentCount;
                    value = currentValue;
                }
                if (currentCount == count & currentValue < value) {
                    count = currentCount;
                    value = currentValue;
                }

            }
        }
        System.out.println(value);
    }
}