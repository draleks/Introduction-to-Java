package array;

/*Модуль 2    Одномерные массивы   7. Даны действительные числа а1, а2,...аn. Найти max( a1 + an, a2 + an−1,...)*/

public class Task7 {
    public static void main(String[] args) {
        int [] array = {1,2,3,6,3,19,1,6,9,5};
        long max = Long.MIN_VALUE;
        int i =0;
        int j = array.length-1;
       while(i<j){
            if(array[i]+array[j]>max){
                max = array[i]+array[j];
            }
            i++;
            j--;
        }
        System.out.println(max);
            }
}
