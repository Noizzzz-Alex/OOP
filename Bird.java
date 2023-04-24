public class Bird extends Animal implements Runnable, Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly(int distance) {
        System.out.printf("bird %s fly: %dm\n",getName(),distance);
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

    @Override
    public String getName() {
        return super.getName();
    }
}
