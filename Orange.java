import java.util.Random;

/**
 * Объём среднего апельсина около 200 см3. масса 298гр
 * средняя плотность 1,49гр/см3
 */
class Orange extends Fruit {
    protected String name = "Апельсин";
    private final float density = 1.49f;
    private float volume;

    public Orange(float weight) {
        super(weight);
        volume = weight/density;
    }
    @Override
    public String toString() {
        return String.format("%-8s |weight: %-3.3f |volume: %-5.2f ",name,(weight/1000),volume);
    }

}