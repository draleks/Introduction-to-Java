package logic;

import entity.Train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class TrainLogic {
    public Train searchByNumber(ArrayList<Train> trains) {
        Train searchTrain = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter train number: ");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int number = sc.nextInt();

        for (Train train : trains) {
            if (train.getNumber() == number) {
                searchTrain = train;
            }
        }
        return searchTrain;
    }

    public ArrayList<Train> sortByNumber(ArrayList<Train> trains) {
        ArrayList<Train> newTrains = new ArrayList<>(trains);
        for (int i = 0; i < newTrains.size(); i++) {
            for (int j = 1; j < newTrains.size() - i; j++) {
                if (newTrains.get(j).getNumber() < newTrains.get(j - 1).getNumber()) {
                    Train temp = newTrains.get(j);
                    newTrains.set(j, newTrains.get(j - 1));
                    newTrains.set(j - 1, temp);
                }
            }
        }

        return newTrains;
    }

    public ArrayList<Train> sortByStationAndNumber(ArrayList<Train> trains) {
        Comparator<Train> comparator = (o1, o2) -> {
            int temp = o1.getStation().compareTo(o2.getStation());
            if (temp == 0) {
                return o1.getNumber() - o2.getNumber();
            }
            return temp;
        };
        trains.sort(comparator);
        return trains;
    }
}