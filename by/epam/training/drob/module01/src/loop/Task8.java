package loop;


/*Модуль 1. Циклы   8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. */
public class Task8 {
    public static void main(String[] args) {
        int number1 = 238681349;
        int number2 = 847201019;
        int[] arrayOfNumber1 = new int[Integer.toString(number1).length()];
        int[] arrayOfNumber2 = new int[Integer.toString(number2).length()];
        for (int i = arrayOfNumber1.length - 1; i >= 0; i--) {
            arrayOfNumber1[i] = number1 % 10;
            number1 /= 10;
        }
        for (int j = arrayOfNumber2.length - 1; j >= 0; j--) {
            arrayOfNumber2[j] = number2 % 10;
            number2 /= 10;
        }
        int count1 = 0;
        int count2 = 0;
        for (int k = 0; k <= 9; k++) {
            for (int i = 0; i < arrayOfNumber1.length; i++) {
                if (k == arrayOfNumber1[i]) {
                    count1 = 1;
                    break;
                }
            }
            for (int j = 0; j < arrayOfNumber2.length; j++) {
                if (k == arrayOfNumber2[j]) {
                    count2 = 1;
                    break;
                }
            }
            if ((count1 == 1) & (count2 == 1))
                System.out.println(k);
            count1 = 0;
            count2 = 0;
        }
    }

}

