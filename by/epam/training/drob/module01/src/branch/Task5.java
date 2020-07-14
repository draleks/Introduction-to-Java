package branch;

/*Модуль 1. Ветвления   5. Вычислить значение функции: */
public class Task5 {
    public static void main(String[] args) {
        double x = 1;
        double y;
        if (x <= 3) {
            y = x * x - 3 * x + 9;
        } else {
            y = 1 / (x * x * x + 6);
        }
        System.out.println(y);
    }
}
