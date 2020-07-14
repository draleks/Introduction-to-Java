package decomposition;

/*Модуль 2    Декомпозиция с использованием методов 8. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.*/

public class Task8 {
    private static int sumOfElement(int[] array,int k ){
        int sum =0;
        if((k>= array.length-1)||(k<1)){
            System.out.println("out of bounds");
            return sum;
        }

        for (int i = k-1;i<=k+1;i++){
            sum+=array[i];


        }
        return sum;

    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(sumOfElement(array,7));
    }
}
