import java.text.Format;
import java.util.Random;

public class Cat {
    private final String name;
    private int appetite; // величина аппетита кота
    private int saturation;//параметр насыщения кота
    private boolean satiety;
    //____________________________________________________________
    //for name

    public String getName() {
        return name;
    }

    //____________________________________________________________
    //for satiety
    public boolean isSatiety() {
        return satiety;
    }

    //____________________________________________________________
    // for appetite
    public int getRandomAppetite() {
        Random a = new Random();
        appetite = a.nextInt(1, 10);
        return appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    //____________________________________________________________
    // for saturation
    public int getSaturation() {
        return saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public int getRandomSaturation() {
        Random a = new Random();
        saturation = a.nextInt(5, 10);
        return saturation;
    }


    // Constructors_______________________________________________
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat(String name) {
        this.name = name;
        this.appetite = getRandomAppetite();
        this.saturation = getRandomSaturation();
    }

    //____________________________________________________________
    public void getInfo() {
        System.out.printf("Имя кота: %-10s |Насыщаемость: %-5d |Аппетит: %-5d |Статус сытости: %-6b",
                name, saturation, appetite, satiety);
        System.out.println();
    }

    public void eat(Plate plate) {
        plate.setFood(plate.getFood() - getAppetite());
        if (getAppetite() == getSaturation()) {
            satiety = true;
            System.out.printf("Кот съел %d еды", getAppetite());
            System.out.println();

        }

    }
}

