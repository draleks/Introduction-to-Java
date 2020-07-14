package branch;

/*Модуль 1. Ветвления   4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие. */
public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int x = 4;
        int y = 5;
        int z = 8;
        boolean sideZ = ((a > x) & (b > y)) || ((a > y) && (b > x));
        boolean sideX = ((a > z) & (b > y)) || ((a > y) && (b > z));
        boolean sideY = ((a > x) & (b > z)) || ((a > z) && (b > x));
        System.out.println(sideZ);
        System.out.println(sideX);
        System.out.println(sideY);

        if (sideX || sideY || sideZ) {
            System.out.println("Пройдет");
        } else {
            System.out.println("Не пройдет");
        }
    }
}
