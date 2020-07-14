import java.util.Objects;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 59;
    public static final int MAX_VALUE_HOUR = 23;
    public static final int DEFAULT_VALUE = 0;

    public Time(int hour, int minute, int second) {
        if (hour >= MIN_VALUE && hour <= MAX_VALUE_HOUR) {
            this.hour = hour;
        } else {
            this.hour = DEFAULT_VALUE;
        }
        if (minute >= MIN_VALUE && minute <= MAX_VALUE) {
            this.minute = minute;
        } else {
            this.minute = DEFAULT_VALUE;
        }
        if (second >= MIN_VALUE && second <= MAX_VALUE) {
            this.second = second;
        } else {
            this.second = DEFAULT_VALUE;
        }


    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= MIN_VALUE && hour <= MAX_VALUE_HOUR) {
            this.hour = hour;
        } else {
            this.hour = DEFAULT_VALUE;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= MIN_VALUE && minute <= MAX_VALUE) {
            this.minute = minute;
        } else {
            this.minute = DEFAULT_VALUE;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= MIN_VALUE && second <= MAX_VALUE) {
            this.second = second;
        } else {
            this.second = DEFAULT_VALUE;
        }
    }

    @Override
    public String toString() {
        return "Current time   " + hour +
                " : " + minute +
                " : " + second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour &&
                minute == time.minute &&
                second == time.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }
}
