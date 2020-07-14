package multi_array;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):{{1,2,3,n},{n,3,2,1}...}*/

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + 1) % 2 == 1) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = (matrix[i].length) - j;
                }

            }
        }
        for (int[] a: matrix ) {
            for (int b: a  ) {
                System.out.print(b+" ");
            }
            System.out.println();

        }
    }
}
