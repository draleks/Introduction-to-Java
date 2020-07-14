package string_as_object;
/* Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
*/

public class Task10 {
    private static int countOfSentence(String str) {
        int countSentence = 0;
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if ((ch=='.')||(ch=='?')||(ch=='!')) {
               countSentence++;
            }

            }

        return countSentence;
    }
    public static void main(String[] args) {
        System.out.println(countOfSentence("Asdas. Saas. Trter? Jjjoioijo!"));
    }
}
