package string_as_object;
/*Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.*/
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter phrase");
        String str = in.nextLine();
        int max=0;
        int count =0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==' ')
            {
                count++;
            }
            else
            {
                if (count>max)
                {
                    max=count;
                }
                count=0;
            }
        }
        System.out.println(max);
        in.close();
    }
}
