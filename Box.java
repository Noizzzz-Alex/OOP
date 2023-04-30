import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Box<T extends Fruit> {
    private final String id;
    private List<T> fruits;
    public Box() {
        this.fruits = new ArrayList<>();
        this.id = generateId();

    }

    private String generateId() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        StringBuilder idBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomIndex = random.nextInt(letters.length());
            char randomLetter = letters.charAt(randomIndex);
            idBuilder.append(randomLetter);
        }
        idBuilder.append("-");
        for (int i = 0; i < 5; i++) {
            int randomIndex = random.nextInt(digits.length());
            char randomDigit = digits.charAt(randomIndex);
            idBuilder.append(randomDigit);
        }
        return idBuilder.toString();
    }
    public String getFruitName() {
        if (!fruits.isEmpty()) {
            T fruit = fruits.get(0);
            return fruit.getName();
        }
        return null;
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public List<T> getFruits() {
        return fruits;
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transferFruitsTo(Box<T> otherBox) {
        try {
            if (this == otherBox) {
                return;
            }
            if (this.getFruits().get(0) instanceof Orange && otherBox.getFruits().get(0) instanceof Apple) {
                throw new IllegalArgumentException("Нельзя переносить апельсины в коробку для яблок!");
            }
            if (this.getFruits().get(0) instanceof Apple && otherBox.getFruits().get(0) instanceof Orange) {
                throw new IllegalArgumentException("Нельзя переносить яблоки в коробку для апельсинов!");
            }
            otherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


    @Override
    public String toString() {
        return String.format("box id: %s| Вес: %.2fkg | Фрукты: %s",
                id, (getWeight() / 1000),this.getFruitName());
    }

}
