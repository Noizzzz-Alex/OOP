import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Cat cat = new Cat("Baron", 10, 20);
        Cat cat1 = new Cat("Bar", 10, 20);
        Cat cat2 = new Cat("BaLL", 10, 20);
        Dog dog = new Dog("Pink", 50, 20);
        Animal animal1 = new Animal("Pokemon", 5, 15);
        Animal animal2 = new Animal("Vermont", 5, 15);
        System.out.printf("Общее кол-во животных: %d\n",Animal.getCount());
        System.out.printf("Общее кол-во котов: %d\n",Cat.getCount());

    }
}

class Animal {
    private static int count;

    public static int getCount() {
        return count;
    }
// инициализатор (с параметром static отработает только один раз при инициализации)
    {
        count++;
    }

    protected String name;
    protected int maxRun;
    protected int maxSwim;

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров", name, distance);
        } else {
            System.out.printf("%s  не смог пробежать %d метров", name, distance);
        }
    }

    public void swim(int distance) {
        {
            if (distance <= maxSwim) {
                System.out.printf("%s проплыл %d метров", name, distance);
            } else {
                System.out.printf("%s  не смог проплыть %d метров", name, distance);
            }
        }
    }
}

class Dog extends Animal {
    public static int getCount() {
        return count;
    }

    public static int count;

    {
        count++;
    }

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
}

class Cat extends Animal {
    public static int count;

    {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("Cat %s can't swim\n", name);
    }
}