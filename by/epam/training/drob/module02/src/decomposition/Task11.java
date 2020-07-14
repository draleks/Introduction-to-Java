package decomposition;

/* Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр*/

public class Task11 {
    private static int compare(int a,int b){
        int countA =0;
        int countB =0;
        countA = (int)(Math.log10(Math.abs(a))+1);
        countB = (int)(Math.log10(Math.abs(b))+1);
        System.out.println(countA);
        System.out.println(countB);
        return countA < countB? b:a;
    }
    public static void main(String[] args) {
        System.out.println(compare(12345,494376262));
    }

}
