package string_as_object;
/* Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".*/

public class Task7 {
    private static String removeDuplicate(String word) {
        String result = new String("");
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains("" + word.charAt(i))) {
                result += "" + word.charAt(i);
            }
        }
result = result.replaceAll(" ","");
        return result;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate("qqsswee ee t ut"));
    }
}
