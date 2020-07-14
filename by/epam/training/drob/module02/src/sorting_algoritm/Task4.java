package sorting_algoritm;

/*Сортировка обменами.*/

public class Task4 {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 3, 9, 4, 6};
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }


            }
        }
        for (int a : array) {
            System.out.print(a + " ");
        }

    }
}
