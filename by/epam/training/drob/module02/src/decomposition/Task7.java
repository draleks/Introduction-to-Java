package decomposition;

/*Модуль 2    Декомпозиция с использованием методов 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.*/

public class Task7 {
    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
private static long sumFactorial(int a,int b){
        long sum=0;
        for (int i=a;i<=b;i+=2){
            sum+=factorial(i);
        }
        return sum;
}
    public static void main(String[] args) {
        System.out.println(sumFactorial(1,9));
        System.out.println(factorial(9));

    }
}
