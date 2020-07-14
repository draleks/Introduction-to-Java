package string_as_object;
/* В строке вставить после каждого символа 'a' символ 'b'.*/

public class Task2 {
    public static void main(String[] args) {
        String str = "aadbadksa";
        String strReplace = str.replaceAll("a","ab");
        System.out.println(strReplace);
    }
}
