package multi_array;


/*Модуль 2    Массивы массивов  15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него*/

public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 4}, {3, 2, 5, 9, 2}, {7, 2, 3, 4, 7}, {2, 2, 2, 4, 1}, {2, 3, 4, 5, 5}};
        int max = Integer.MIN_VALUE;
        for (int[] a : matrix) {
            for (int b : a) {
                if (b > max) {
                    max = b;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 1) {
                    matrix[i][j] = max;
                }
            }
        }

        for (int[] a : matrix) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
