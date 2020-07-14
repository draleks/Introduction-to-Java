package string_as_object;
/* Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
*/

public class Task8 {
    private static String search(String str) {
        String[] stringArray = str.split(" ");
        String strMax = stringArray[0];
        for (String s : stringArray) {
            if (s.length() > strMax.length()) {
                strMax = s;

            }

        }
        return strMax;
    }

    public static void main(String[] args) {
        System.out.println(search("qaz za sdwer rtfg"));
    }
}
