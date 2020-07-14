package string_as_array;

/* В строке найти количество цифр.*/
public class Task3 {
    private static int countDigit(String s) {
        int count = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch;
            ch = charArray[i];
            if ((ch) > 47 && (ch) < 60) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigit("ewewe123iio4560099"));
    }
}
