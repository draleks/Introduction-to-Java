package array;

/*Модуль 2    Одномерные массивы    4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/


public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 8, 9, 5, 2};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int temp;
        int minInd = 0;
        int maxInd = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                maxInd = i;
            }
            if (array[i] < min) {
                min = array[i];
                minInd = i;
            }
        }
        temp = array[maxInd];
        array[maxInd] = array[minInd];
        array[minInd] = temp;
        for (int a : array) {
            System.out.print(a + " ");
        }

    }
}
