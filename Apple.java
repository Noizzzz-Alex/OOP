
class Apple extends Fruit {

    String name = "Apple";

    public Apple(float weight) {
        super(weight);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, weight);
    }
}


