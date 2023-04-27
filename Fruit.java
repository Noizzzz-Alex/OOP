abstract class Fruit {
    protected String name = "Фрукт";
    protected float weight;//масса
    protected float volume;//объем
    protected float density;//плотность

    @Override
    public String toString() {
        return String.format("%-10s |weight: %-3.3f |volume: %-5.2f ",name,(weight/1000),volume);
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }


}
