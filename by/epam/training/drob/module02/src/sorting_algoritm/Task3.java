package sorting_algoritm;

/*Сортировка выбором.*/

public class Task3 {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 3, 9, 4, 6};
        int max;
        int indMax;
        for (int i = 0; i < array.length; i++) {
            max = array[i];
            indMax = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    indMax = j;
                }
            }
            array[indMax] = array[i];
            array[i] = max;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
