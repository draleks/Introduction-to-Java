package branch;

/*Модуль 1. Ветвления   1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.*/

public class Task1 {
    public static void main(String[] args) {
        int x = 90;
        int y = 30;

        if (x + y < 180) {
            System.out.println("exist");
            if ((x == 90) || (y == 90) || (180 - x - y == 90)) {
                System.out.println("right triangle");
            } else {
                System.out.println("not right triangle");
            }
        } else {
            System.out.println("not exist");
        }


    }
}
