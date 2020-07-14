package multi_array;

/*Найти положительные элементы главной диагонали квадратной матрицы.*/


public class Task10 {
    public static void main(String[] args) {
        int[][] matrix = {{-1, 2, 3, 4, 4}, {3, 2, 5, 9, 2}, {7, 2, 3, 4, 7}, {2, 2, 2, 4, 1}, {2, 3, 4, 5, 5}};

        for (int[] a : matrix) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        System.out.println("----------");
        for (int i=0;i<matrix.length;i++){
            if(matrix[i][i]>0){
            System.out.print(matrix[i][i]+" ");}
        }
    }
}
