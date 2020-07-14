package line_program;

/*Модуль1      Линейный программы     4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
*/

public class Task4 {
    public static void main(String[] args) {
        int temp;
        double numberResult;
        double numberInitial = 965.987;
        temp = (int) Math.floor(numberInitial);
        numberResult = temp / 1000d + (int) Math.rint((numberInitial - temp) * 1000);

        System.out.println("Initial value = " + numberInitial);
        System.out.println("Resalt value = " + numberResult);
    }

}
