package string_as_object;
/* Проверить, является ли заданное слово палиндромом.*/

public class Task3 {
    private static void isPalindrome(String str){
        StringBuilder reverseString = new StringBuilder(str);
       String newStr = reverseString.reverse().toString();
        System.out.println(str.equals(newStr));

    }
    public static void main(String[] args) {
        isPalindrome(new String("2asdffdsa2"));

    }
}
