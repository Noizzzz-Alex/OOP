public class Dog extends Animal implements Runnable {
    private int weight;
    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }
//имплементировать значит реализовать

    @Override
    public void jump() {
        System.out.println("Dog jump");
    }

    @Override
    public void voice() {
        System.out.println("woof-woof");
    }

    @Override
    public void swim(int distance) {
        System.out.printf("dog %s swim: %dm\n",getName(),distance);
    }

    @Override
    public void run(int distance) {
        System.out.printf("dog %s run: %dm\n",getName(),distance);
    }
}
