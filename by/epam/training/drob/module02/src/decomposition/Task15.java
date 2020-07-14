package decomposition;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/

public class Task15 {
    private static void findNumber(int n){
        int i = (int) Math.pow(10,n-1);
        int j = (int)Math.pow(10,n)-1;
        while(i<=j){
           if(find(i)!=0)
               System.out.println(i);
            i++;
        }
    }

    private static int find(int i) {
        int j = i;
        int oldNum = 11;
        int curNum = 10;
        while (i > 0 && curNum < oldNum) {
            oldNum = curNum;
            curNum = i % 10;
            i /= 10;
        }
        if (i == 0 && curNum < oldNum) {
           return j;
        }
        return 0;
    }

    public static void main(String[] args) {
        findNumber(2);
    }
}
