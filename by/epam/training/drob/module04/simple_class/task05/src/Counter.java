import java.util.Objects;
import java.util.Random;

class Counter {
    private int min;
    private int max;
    private int value;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return min == counter.min &&
                max == counter.max &&
                value == counter.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, value);
    }

    @Override
    public String toString() {
        return "value=  " + value + "   min=   " + min + "  max=  " + max;
    }

    public Counter(int min, int max, int value) {
        this.min = min;
        this.max = max;
        this.value = value;
    }

    Random random = new Random();

    public Counter() {
        min = random.nextInt(50);
        do {
            max = random.nextInt(100);
        }
        while (min > max);
        value = (int) ((max - min) /((random.nextInt(3))+1));
    }

    public void increaseValue() {
        if (value + 1 <= max) {
            value++;
        } else {
            System.out.println("Max value of counter");
        }
    }

    public void decreaseValue() {
        if (value - 1 <= min) {
            value--;
        } else {
            System.out.println("Min value of counter");
        }
    }

    public void showCounter() {
        System.out.println(this.toString());
    }
}


