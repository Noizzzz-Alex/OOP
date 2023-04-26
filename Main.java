import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

    }
}
abstract class Fruit{
    private final float weight;



    public Fruit(float weight) {
        this.weight = weight;
    }
}
class Apple extends Fruit{

    public Apple(float weight) {
        super(weight);
    }
}
class Orange extends Fruit {

    public Orange(float weight) {
        super(weight);
    }
}
class Box<T extends Fruit>{
    ArrayList<T> fruits;

}
