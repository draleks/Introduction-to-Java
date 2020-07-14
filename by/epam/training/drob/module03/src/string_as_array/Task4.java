package string_as_array;
/* В строке найти количество чисел.
*/

public class Task4 {
    private static void countNumber(String str) {
        int count = 0;
        char[] arrayChar = str.toCharArray();
        for (int i = 0; i < arrayChar.length - 1; i++) {
            if (Character.isDigit(arrayChar[i])) {
                if (Character.isDigit(arrayChar[i + 1])) {
                } else {
                    count++;
                }
            }
        }
        if (Character.isDigit(arrayChar[arrayChar.length - 1])) {
            count++;
        }

        System.out.println("amount of numbers = "+count);
    }


    public static void main(String[] args) {
        String str = "ст1рока 7 азаза 666 тест :() 2";
        countNumber(str);
    }
}
