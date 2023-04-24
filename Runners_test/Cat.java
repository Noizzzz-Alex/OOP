package Runners_test;

public class Cat implements Runner {
    private String name;
    private int maxJump;
    private int maxRun;

    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxRun() {
        return 0;
    }

    @Override
    public int getMaxJump() {
        return 0;
    }
}
