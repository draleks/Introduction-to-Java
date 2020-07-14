package multi_array;

/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 4}, {3, 2, 5, 1, 2}, {7, 2, 3, 4, 7}, {2, 2, 2, 4, 1}, {2, 3, 4, 5, 5}};
        int k = 4;
        int p = 4;

        for (int i = 0; i < matrix.length; i++) {
            if (i == k) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (p == j) {
                        System.out.print(matrix[i][j] + "  ");
                    } else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

