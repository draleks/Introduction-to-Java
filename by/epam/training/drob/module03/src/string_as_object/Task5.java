
package string_as_object;
/* Подсчитать, сколько раз среди символов заданной строки встречается буква “а”*/

public class Task5 {
    private static int coutA(String str){
        int count =0;
        for (char a:str.toCharArray()) {
            if(a=='a'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(coutA("aasdkfka"));
    }
}
