package line_program;

/*Модуль1      Линейный программы      2.Вычислить значение выражения по формуле*/

public class Task2 {
    public static void main(String[] args) {
        double a= 1;
        double b =3;
        double c =9;
        double z;
        z = (b+Math.sqrt(b*b+4*a*c))/2*a-Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.printf("%.2f",z);
    }

}
