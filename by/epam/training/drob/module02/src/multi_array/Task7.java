package multi_array;

/* Сформировать квадратную матрицу порядка N по правилу: a[i,j] = sin((i2+j2)/n) и подсчитать количество положительных элементов в ней*/

public class Task7 {
    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
        int n = matrix.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((i * i + j * j) / n);
                if(matrix[i][j]>0){
                    count++;
                }
            }
        }

        System.out.println("count= "+count);
    }
}
