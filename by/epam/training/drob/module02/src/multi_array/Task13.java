package multi_array;

/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.*/

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = {{-1, 2, 3, 4, 4}, {3, 2, 5, 9, 2}, {7, 2, 3, 4, 7}, {2, 2, 2, 4, 1}, {2, 3, 4, 5, 5}};
        int temp;
        for (int j = 0; j < matrix[0].length; j++) {
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] > matrix[i+1][j]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i+1][j];
                        matrix[i+1][j] = temp;
                        sorted = false;
                    }
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
