package multi_array;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = {{-1, 2, 3, 4, 4}, {3, 2, 5, 9, 2}, {7, 2, 3, 4, 7}, {2, 2, 2, 4, 1}, {2, 3, 4, 5, 5}};
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {    // для сортировки по убыванию меняем на <
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;
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
