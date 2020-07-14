package array;

/*Модуль 2    Одномерные массивы   10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/

public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        array[i] = array[j];
                        array[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
