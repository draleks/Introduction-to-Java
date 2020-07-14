package string_as_object;
/* С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.*/

public class Task4 {
    private static String make(String str) {
        String newString = "";
        newString += str.charAt(7);
        newString += str.charAt(3);
        newString += str.charAt(4);
        newString += str.charAt(7);

        return newString;
    }

    public static void main(String[] args) {
        System.out.println(make("информатика"));
    }
}
