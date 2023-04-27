import java.util.Random;

/**
 * Объём среднего 145 грамм имеет объем 126 см3.
 * средняя плотность 1,15гр/см3
 */
class Apple extends Fruit{
    protected String name = "Яблоко";
    private float density = 1.15f;
    private float volume;

    public Apple(float weight) {
        super(weight);
        volume = weight * density;
    }

    @Override
    public String toString() {
        return String.format("%-8s |weight: %-3.3fkg |volume: %-5.2fsm3 ", name, (weight / 1000), volume);
    }

}

