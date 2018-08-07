package kiselev.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] fortunesArray;
    private int min;
    private int max;

    public RandomFortuneService(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public String[] getFortunesArray() {
        return fortunesArray;
    }

    public void setFortunesArray(String[] fortunesArray) {
        this.fortunesArray = fortunesArray;
    }

    @Override
    public String getFortune() {
        return fortunesArray[randInt(min, max)];
    }

    private int randInt(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
