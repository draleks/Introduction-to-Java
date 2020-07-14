package multi_array;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.*/

public class Task9 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 4}, {3, 2, 5, 9, 2}, {7, 2, 3, 4, 7}, {2, 2, 2, 4, 1}, {2, 3, 4, 5, 5}};
        int maxSum = 0;
        int sum;
        int maxNumber = 0;
        int number ;


        for (int i = 0; i < matrix[0].length; i++) {
            sum = 0;
            number = i;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }

            if(sum>maxSum){
                maxSum = sum;
                maxNumber = number;
            }
        }

        for (int[] a : matrix) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();

        }
        System.out.println("number= "+maxNumber+"  sum= "+maxSum);
    }
}
