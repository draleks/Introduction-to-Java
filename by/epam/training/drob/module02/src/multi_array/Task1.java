package multi_array;

/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.*/

public class Task1 {
    public static void main(String[] args) {
        int [][] matr ={{1,2,3,4,4},{3,2,5,1,2},{7,2,3,4,7},{2,2,2,1,1}};
        for(int i =0;i<matr.length;i++){

            for (int j=0;j<matr[i].length;j+=2){
             if(matr[0][j]>matr[matr.length-1][j])
                System.out.print(matr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
