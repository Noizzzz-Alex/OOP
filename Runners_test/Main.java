package Runners_test;

public class Main {
    public static void main(String[] args) {
        //бегуны
        Runner[] runners = {
                new Cat("Baron", 2, 1500),
                new Cat("Ball", 3, 1000),
                new Human("Barri", 2, 4500),
                new Human("Billy", 3, 4000),
                new Robot("C3PO", 1, 5000),
                new Robot("R2D2", 5, 15000),
        };

        //препятствия
        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(3),
                new Track(1500),
                new Wall(2),
                new Track(2000),
                new Wall(4),
                new Track(3000)};
        for (Runner runner : runners) {
            for (Obstacle obst : obstacles) {
                if (obst instanceof Track) {
                    if (!runner.run(obst.getLength())) {
                        break;
                    }
                } else if (runner instanceof Wall) {
                    if (!runner.jump(obst.getWeight())) {
                        break;
                    }
                }
            }
        }
    }
}
