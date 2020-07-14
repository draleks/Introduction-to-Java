package array;

/*Модуль 2    Одномерные массивы    3.Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/

public class Task3 {
    public static void main(String[] args) {
        int[] array = {0, 4, 0, 7, 0, -9, -5, 2};
        int countPositive = 0;
        int countNegative = 0;
        int countNull = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositive++;
            } else {
                if (array[i] == 0) {
                    countNull++;
                } else {
                    countNegative++;
                }
            }
        }
        System.out.println("negative=" + countNegative + "  positive=" + countNull + "  null=" + countPositive);

    }
}
