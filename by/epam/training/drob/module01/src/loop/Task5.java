package loop;

/*Модуль 1. Циклы    5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид: */
public class Task5 {
    public static void main(String[] args) {
        double sum = 0;
        int n = 10;
        double e = 0.00023;
        double temp;
        for (int i = 2; i <= n + 1; i++) {
            temp = Math.abs(1 / Math.pow(i, n));
            if (temp > e) {
                sum += temp;
            }
        }
        System.out.println(sum);
    }
}
