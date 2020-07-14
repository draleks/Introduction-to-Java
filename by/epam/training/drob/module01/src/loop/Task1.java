package loop;


/*Модуль 1. Циклы   1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа. */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        long number;
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input number >>>");
        while (!sc.hasNextLong()){
            sc.next();
            System.out.println("incorrect");
        }
        number=sc.nextLong();
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println("sum= "+sum);
    }
}
