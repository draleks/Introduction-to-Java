package multi_array;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.*/

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(16);
            }
        }

        for (int[] a : matrix) {
            for (int b : a) {
                if (b > 9) {
                    System.out.print(b + "   ");
                } else {
                    System.out.print(b + "    ");
                }
            }
            System.out.println();
        }
        System.out.print("line numbers  ");

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5)
                    count++;
            }
            if (count > 2)
                System.out.print(i + 1 + "  ");
        }
    }
}
