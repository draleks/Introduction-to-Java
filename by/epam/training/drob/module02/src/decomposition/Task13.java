package decomposition;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.*/

public class Task13 {
    private static void findCouple(int n) {

        for (int i = n; i <= n * 2 - 2; i++) {
            int flag1 = 0, flag2 = 0;
            int k = i + 2;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag1 = 1;
                    break;
                }
            }
            for (int j = 2; j * j <= k; j++) {
                if (k % j == 0) {
                    flag2 = 1;
                    break;
                }
            }
            if ((flag1 != 1) && (flag2 != 1)) {
                System.out.println(i + "  " + k);
            }
        }
    }

    public static void main(String[] args) {
        findCouple(100);
    }
}
