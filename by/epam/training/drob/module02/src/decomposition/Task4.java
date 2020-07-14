package decomposition;

/*Модуль 2    Декомпозиция с использованием методов 4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. */

public class Task4 {
    private static double distanse (double x1,double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
    public static void main(String[] args) {
        int [][] arrayCoordinate = {{1,3},{2,5},{9,2},{2,8}};

    }
}
