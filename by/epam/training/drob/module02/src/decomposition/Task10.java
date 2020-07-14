package decomposition;

/* Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N. */

public class Task10 {
    private static int[] createArray(int n) {
        int[] array = new int[Integer.toString(n).length()];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = n % 10;
            n = n / 10;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array;
        array = createArray(1234567);
        for (int n : array) {
            System.out.println(n);
        }
    }
}
