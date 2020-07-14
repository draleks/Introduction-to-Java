package line_program;

/*Модуль1      Линейный программы      2.Вычислить значение выражения по формуле*/

public class Task3 {
    public static void main(String[] args) {
        double x = 1;
        double y = 1;
        double result;
        result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(result);
    }
}