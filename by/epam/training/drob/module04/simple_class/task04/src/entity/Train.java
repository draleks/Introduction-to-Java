package entity;

import java.util.Objects;

public class Train  {
    private String station;
    private int number;
    private Time time;

    public Train(String station, int number, Time time) {
        this.station = station;
        this.number = number;
        this.time = time;
    }

    @Override
    public String toString() {
        return "station='" + station + '\'' +
                ", number=" + number +
                ", time=" + time;
    }

    public String getStation() {
        return station;
    }

    public int getNumber() {
        return number;
    }

    public Time getTime() {
        return time;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number &&
                station.equals(train.station) &&
                time.equals(train.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(station, number, time);
    }


}
