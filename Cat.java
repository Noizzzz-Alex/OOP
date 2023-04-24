public class Cat extends Animal implements Runnable {
    public String getColor() {
        return color;
    }

    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void swim(int distance) {
        System.out.printf("cat %s swim: %dm\n",getName(),distance);
    }

    @Override
    public void run(int distance) {
        System.out.printf("cat %s run: %dm\n",getName(),distance);
    }
}
