
class Orange extends Fruit {
    private String name = "Orange";
    public Orange(float weight) {
        super(weight);
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s, %s",name,weight);
    }
}