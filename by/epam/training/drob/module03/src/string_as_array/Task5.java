package string_as_array;
/*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
*/
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter phrase");
        String sentence = in.nextLine();
        String [] array = sentence.split(" ");
        sentence="";
        for (int i=0;i<array.length;i++)
        {
            if (array[i].length()!=0)
            {
                sentence+=array[i];
                if (i!=array.length-1)
                {
                    sentence+=" ";
                }
            }
        }
        System.out.println(sentence);
        in.close();
    }
}
