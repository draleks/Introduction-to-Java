package multi_array;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):{{1,1,1,1},{0,1,1,0},...}*/

public class Task6 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((((j + i) > n - 1) & (i < j)) | ((j + i < n - 1) & (i > j))) {
                    matrix[i][j] = 0;
                } else
                    matrix[i][j] = 1;

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
