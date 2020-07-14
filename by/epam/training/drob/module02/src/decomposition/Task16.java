package decomposition;

/*Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/

public class Task16 {

    private static void findSum(int n) {
        int sum = 0;
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            int flag = 0;
            int k = i;
            while (k > 0) {
                if (k % 2 == 0) {
                    flag = 1;
                    break;
                }
                k /= 10;
            }
            if (flag == 0)
                sum += i;
        }
        System.out.println("sum is= " + sum);
        int count = 0;
        while (sum > 0) {
            if (sum % 2 == 0) {
                count++;
            }
            sum /= 10;
        }
        System.out.println("contain even numbers= " + count);
    }

    public static void main(String[] args) {
        findSum(2);

    }
}
