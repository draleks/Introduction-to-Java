package array;

/*Модуль 2    Одномерные массивы    6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.*/

public class Task6 {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11};
        for (int i = 1; i < array.length; i++) {
            boolean flag = true;
            for (int j = 2; j < i + 1; j++) {
                if ((i + 1) % j == 0)
                    flag = false;
            }
            if (flag) {
                sum += array[i];
                // System.out.println("array["+i+"]="+array[i]);}
            }

        }
        System.out.println(sum);
    }
}