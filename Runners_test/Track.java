package Runners_test;

public class Track implements Obstacle {
    private int length;


    public Track(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
