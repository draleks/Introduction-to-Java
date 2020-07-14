package decomposition;

/*Модуль 2    Декомпозиция с использованием методов  3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника*/

public class Task3 {
    private static double square(int a) {
        return 6 * Math.sqrt(3) * a * a / 4;
    }

    public static void main(String[] args) {
        double result;
        result = square(4);
        System.out.println(result);
    }
}
