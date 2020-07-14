package loop;


/*Модуль 1. Циклы    Вычислить значения функции на отрезке [а,b] c шагом h: */

public class Task2 {
    public static void main(String[] args) {
        double a = 1.5;
        double b = 2.8;
        double h = 0.3;
        double f;
        do {
            if (a > 2) {
                f = a;
            } else {
                f = -a;
            }
            System.out.println("" + a + ": " + f);
        }
        while ((a += h) <= b);
    }
}
