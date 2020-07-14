package line_program;

/*Модуль1      Линейный программы     5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.*/

public class Task5 {
    public static void main(String[] args) {
        int time = 3731;
        int hour;
        int minute;
        int second;
        hour = time/3600;
        minute = (time%3600)/60;
        second = time%60;


        System.out.println(hour+"hh "+minute+"mm "+second+"ss");
    }
}
