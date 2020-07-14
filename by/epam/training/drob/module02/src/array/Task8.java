package array;

/*Модуль 2    Одномерные массивы   8. Дана последовательность целых чисел a1,a2,... ,an. Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( a1,a2,... ,an ) .*/


public class Task8 {
    public static void main(String[] args) {
        int[] array = {3, 2, 3, 3, 2, 1, 6, 3, 1, 6, 9, 5, 1};
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int anArray : array) {
            if (anArray < min) {
                min = anArray;
                count = 0;
            }
            if (anArray == min) {
                count++;
            }
        }
        System.out.println("min= "+min + "    count= " + count);
        int[] arrayNew = new int[array.length - count];
        for (int i = 0, j = 0; j < array.length; j++) {
            if (array[j] != min) {
                arrayNew[i] = array[j];
                i++;
            }
        }
        for (int anArrayNew : arrayNew) {
            System.out.print(anArrayNew);

        }
    }
}