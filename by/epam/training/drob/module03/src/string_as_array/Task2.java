package string_as_array;
/* Замените в строке все вхождения 'word' на 'letter'.*/
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter phrase");
        String phrase = in.nextLine();
        String [] arrayWord = phrase.split(" ");
        for (int i=0;i<arrayWord.length;i++)
        {
            if (arrayWord[i].equals("word"))
            {
                arrayWord[i]="letter";
            }
        }
        phrase="";
        for (String temp:arrayWord)
        {
            phrase+=temp+" ";
        }
        System.out.println(phrase);
        in.close();

    }
}
