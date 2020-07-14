package multi_array;

/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/


public class Task2 {
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3,4,4},{3,2,5,1,2},{7,2,3,4,7},{2,2,2,4,1},{2,3,4,5,5}};
        for(int i=0,j=0;(i<matrix.length)&&(j<matrix[i].length);i++,j++){
            System.out.print(matrix[i][j]+"  ");
        }

    }
}
