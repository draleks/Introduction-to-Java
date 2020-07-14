package sorting_algoritm;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.*/

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9};
        int[] arrayResult = new int[array1.length + array2.length];
        int k = 3;
        for (int i = 0; i < arrayResult.length; i++) {
            if (i < k) {
                arrayResult[i] = array1[i];
            } else {
                if (i < (k + array2.length)) {
                    arrayResult[i] = array2[i - k];
                } else {
                    arrayResult[i] = array1[i - k - 1];
                }
            }
        }
        for (int a : arrayResult) {
            System.out.print(a + " ");
        }
    }
}
