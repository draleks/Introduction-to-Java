package multi_array;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.*/

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int count;
        int countOne;
        Random r = new Random();
        for (int j = 0; j < matrix[0].length; j++) {
            count = j;
            countOne = 0;
            while (!(count == countOne)) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = r.nextInt(2);
                    if (matrix[i][j] == 1) {
                        countOne++;
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
