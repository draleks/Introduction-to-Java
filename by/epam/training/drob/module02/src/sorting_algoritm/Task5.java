package sorting_algoritm;

/**
 * 5. Сортировка вставками. Дана последовательность чисел a1, a2, ..., ai. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е.
 * a1 <= a2 <= ... <= an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью
 * двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task5 {
    public static void printArray(int[] array) {
        for (int temp : array) {
            System.out.println(temp);
        }
    }

    private static int binarySearch(int[] array, int low, int high, int key) {
        int middle;

        while (low <= high) {
            middle = high + low / 2;
            if (key > array[middle]) {
                low = middle + 1;
            } else if (key < array[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }

        return low;
    }

    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {

            int key = array[i];

            int insPos = binarySearch(array, 0, i - 1, key);

            for (int j = i; j > insPos; j--) {
                array[j] = array[j - 1];
            }
            array[insPos] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 11, 5, 6, 8, 10};
        Task5.sort(array);
        Task5.printArray(array);

    }
}


