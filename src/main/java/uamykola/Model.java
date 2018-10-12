package uamykola;

import java.util.ArrayList;
import java.util.Random;

public class Model {
    public static final int START_MAX = 100;
    public static final int START_MIN = 0;
    private int rangeMax;
    private int rangeMin;
    private int soughtValue;
    private final Random random = new Random();
    private ArrayList<Integer> turnHistory = new ArrayList<Integer>();

    public Model() {
        rangeMax = START_MAX;
        rangeMin = START_MIN;
    }

    public int makeNumber() {
        return random.nextInt(rangeMax - rangeMin + 1) + rangeMin;
    }

    public void setRangeMax(int rangeMax) {
        this.rangeMax = rangeMax;
    }

    public void setRangeMin(int rangeMin) {
        this.rangeMin = rangeMin;
    }

    public void setSoughtValue(int soughtValue) {
        this.soughtValue = soughtValue;
    }

    public void addTurn(int turn) {
        this.turnHistory.add(turn);
    }

    public ArrayList<Integer> getTurnHistory() {
        return turnHistory;
    }

    public int getRangeMax() {
        return rangeMax;
    }

    public int getRangeMin() {
        return rangeMin;
    }

    public int getSoughtValue() {
        return soughtValue;
    }
}
