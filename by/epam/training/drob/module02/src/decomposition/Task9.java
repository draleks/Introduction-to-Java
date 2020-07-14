package decomposition;

/*Модуль 2    Декомпозиция с использованием методов 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой*/

public class Task9 {
    private static double square (int x,int y,int z,int t){
        double s = 0;
        double diag = Math.sqrt(x*x+y*y);
        double p =(z+t+diag)/2;
        s = x*y/2 + Math.sqrt(p*(p-diag)*(p-z)*(p-t));
        return s;
    }
    public static void main(String[] args) {
        System.out.println(square(3,4,3,4));

    }
}
