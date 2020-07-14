package  sorting_algoritm;

/*Модуль 2    Одномерные массивы сортировки  6. Сортировка Шелла.*/

public class Task6 {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 3, 9, 4, 6,8};
       int d =array.length/2;
       while(d>0){
           for(int i =0;i<array.length-d;i++){
               int j =i;
               while(j>=0&&array[j]>array[j+d]){
                   int temp= array[j];
                   array[j]= array[j+d];
                   array[j+d] = temp;
                   j-=d;

               }
           }
           d/=2;
       }
        for (int a : array) {
            System.out.print(a + " ");
        }

    }

}
