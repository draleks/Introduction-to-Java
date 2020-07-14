package decomposition;

/* Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.*/

public class Task12 {

    private static int[] number(int k, int n) {
        int count = 0;
        int temp = 0;
        for (int i = n; i > 0; i--) {
            if (temp + i <= k) {
                temp += i;
                count++;

            }
        }

        int[] array = new int[count];
        temp = 0;
        for (int j = n; j > 0; j--) {
            if (temp + j <= k) {
                array[count - 1] = j;
                temp += j;
                count--;

            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = number(35, 10);
        for (int a : array) {
            System.out.print(a + "   ");
        }

    }
}