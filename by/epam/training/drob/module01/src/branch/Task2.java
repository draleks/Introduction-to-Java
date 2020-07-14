package branch;

/*Модуль 1. Ветвления   2. Найти max{min(a, b), min(c, d)}*/

public class Task2 {
    public static void main(String[] args) {
        double a = 7;
        double b = 6;
        double c = 3;
        double d = 4;
        double minAB;
        double minCD;
        double maxResult;

        minAB = (a < b) ? a : b;
        minCD = (c < d) ? c : d;
        maxResult = (minAB > minCD) ? minAB : minCD;
        System.out.println(maxResult);
    }
}
