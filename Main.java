import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("ball", "white");
//        cat1.jump();
//        cat1.voice();
//        System.out.println(cat1.getName());
//        System.out.println(cat1.getColor());
        Dog dog1 = new Dog("baron", 20);
//        dog1.jump();
//        dog1.voice();
        Animal cat2 = new Cat("ballu", "black");
//        System.out.println(dog1.getWeight());
//        cat2.jump();
//        cat2.voice();
////        if (cat2 instanceof Dog) {
////            System.out.printf("weight = ", ((Dog) cat2).getWeight());
////        }
//        System.out.println(((Cat) cat2).getColor());
//        voiceallanimals(new Animal[]{cat1, dog1, cat2});
        CatV2 catv2 = new CatV2("bublle");
        Runnable catv2_2 = new CatV2("omen");
        DogV2 dog_2 = new DogV2("bull");
        Bird bird = new Bird("duck");

        Object[] animals2 = new Object[] {catv2_2,catv2,dog_2,bird};
        for (Object a: animals2){
            if (a instanceof Flyable) {
                System.out.println(((Runnable) a).getName());
}
        }
    }


    public static void voiceallanimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.voice();
            if (animal instanceof Dog) {
                System.out.println("dog weight: " + ((Dog) animal).getWeight());
            }
        }
    }
}

interface Runnable{
    String getName();

    void run(int distance);
    void swim(int distance);


}
interface Flyable {
    void fly(int distance);
}
class CatV2 implements Runnable{
    public CatV2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    private String name;

    @Override
    public void run(int distance) {
        System.out.printf("cat ran %d",distance);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("cat swam %d",distance);
    }
}
class DogV2 implements Runnable{
    private String name;

    public DogV2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void swim(int distance) {

    }
}
class Bird implements Flyable,Runnable{
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void swim(int distance) {

    }

    @Override
    public void fly(int distance) {
        System.out.printf("bird fly: %d",distance);
    }
}


abstract class Animal {
    public String getName() {
        return name;
    }

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println("animal jump");
    }

    public abstract void voice();
}

class Dog extends Animal {
    public int getWeight() {
        return weight;
    }

    private int weight;

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("bow-wow");
    }

    @Override
    public void jump() {
        System.out.println("dog is jump");
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void jump() {
        System.out.println("cat is jump");
    }
}