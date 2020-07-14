package decomposition;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

public class Task17 {

    private static void find(int n) {
        int count = 0;
        while (n > 0) {
            int sum = 0;
            int temp = n;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            n -= sum;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        find(100);
    }
}
