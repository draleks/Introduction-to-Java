package loop;


import java.util.Scanner;

/*Модуль 1. Циклы    7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры. */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberM;
        int numberN;
        do {
            System.out.println("Please enter a positive number M");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("not a integer number");
            }
            numberM = sc.nextInt();
        }

        while (numberM < 0);
        System.out.println("M is" + numberM);
        do {
            System.out.println("Please enter a positive number more then M");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("not a integer number");
            }
            numberN = sc.nextInt();
        }
        while (numberN < 0);
        System.out.println("N is" + numberN);
        for (int i = numberM; i <= numberN; i++) {
            System.out.print(i + " - ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
