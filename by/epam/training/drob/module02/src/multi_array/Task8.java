package multi_array;

/*МВ числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.*/

import java.util.Scanner;

public class Task8 {

    static int input(int n) {
        int value;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter a number 0<and<" + n + "   >>>");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("not number");
            }
            value = sc.nextInt();
        }
        while ((value < 0) | (value > n));
        return value;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 4}, {3, 2, 5, 1, 2}, {7, 2, 3, 4, 7}, {2, 2, 2, 4, 1}, {2, 3, 4, 5, 5}};
        int column1;
        int column2;
        int temp;
        for (int[] a : matrix) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();

        }
        column1 = Task8.input(4);
        column2 =Task8.input(2);

        for (int i=0;i<matrix.length;i++){
          temp = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2]=temp;
        }
        for (int[] a : matrix) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();

        }


    }
}
