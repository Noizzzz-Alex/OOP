package Runners_test;

public class Wall implements Obstacle {
    private int weight;

    public Wall(int weight) {
        this.weight = weight;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
