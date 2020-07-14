package string_as_object;

/* Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.*/
public class Task9 {
    private static String search(String str) {
        int countUp = 0;
        int countLow = 0;
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (Character.isLowerCase(ch)) {
                countLow++;
            }
            if (Character.isUpperCase(ch)) {
                countUp++;
            }
        }
        return "quantity of low case = " + countLow + " quantity of up case = " + countUp;
    }

    public static void main(String[] args) {
        System.out.println(search("sdfgIKJHK  //"));
    }
}
