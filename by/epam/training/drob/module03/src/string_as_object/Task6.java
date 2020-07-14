package string_as_object;
/* Из заданной строки получить новую, повторив каждый символ дважды.*/

public class Task6 {
    private static String duplicate(String str){
        StringBuilder newStr = new StringBuilder();
        for (char a:str.toCharArray()) {
            newStr.append(a).append(a);
            }

        return newStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(duplicate("asdf"));
    }
}
