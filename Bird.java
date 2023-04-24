public class Bird extends Animal implements Runnable, Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly(int distance) {
        System.out.printf("dog %s swim: %dm\n",getName(),distance);
    }

    @Override
    public void swim(int distance) {

    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void voice() {

    }
}
