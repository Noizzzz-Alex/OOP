public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean availabilityOfFood(Cat cat) {
        if ((getFood() - cat.getAppetite()) < 0) {
            System.out.println("Еды не хватит!");
            return false;
        } else {
            System.out.printf("Остаток еды %d",getFood());
            System.out.println();
            return true;

        }
    }
}