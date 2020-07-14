package multi_array;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):{{1,1,1,1},{2,2,2,0},{3,3,0,0},{4,0,0,0}}*/

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = new int[8][8];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j + i < matrix.length) {
                    matrix[i][j] = i + 1;
                } else
                    matrix[i][j] = 0;

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
