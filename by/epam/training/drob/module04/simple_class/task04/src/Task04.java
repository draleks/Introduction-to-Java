/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
        Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
        номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
        Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
        назначения должны быть упорядочены по времени отправления.*/



import entity.Depo;
import entity.Train;
import logic.TrainLogic;
import view.View;
import entity.Time;


import java.util.ArrayList;


public class Task04 {
    public static void main(String[] args) {
        View view = new View();
        TrainLogic trainLogic = new TrainLogic();
        ArrayList<Train> trains = new ArrayList<Train>(5);
        trains.add(new Train("Minsk ", 1, new Time(11, 10)));
        trains.add(new Train("Minsk ", 4, new Time(5, 10)));
        trains.add(new Train("Moskow", 3, new Time(5, 10)));
        trains.add(new Train("Moskow", 2, new Time(14, 25)));
        trains.add(new Train("Boston", 5, new Time(22, 15)));

        Depo depo = new Depo(trains);

        view.showAll(trainLogic.sortByNumber( depo.getTrains()));
        view.showTrain(trainLogic.searchByNumber( depo.getTrains()));
        System.out.println("------------------------------");
        view.showAll(trainLogic.sortByStationAndNumber(depo.getTrains()));
    }
}
