package decomposition;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию*/

public class Task14 {

    private static void numberOfArmstrong(int k) {
        int count;

        for (int i = 1; i <= k; i++) {
            int sum = 0;
            count = (int) (Math.log10(i) + 1);
            int j = i;
            while (j != 0) {
                sum += (int) (Math.pow(j % 10, count));
                j /= 10;

            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        numberOfArmstrong(100000);
    }
}
