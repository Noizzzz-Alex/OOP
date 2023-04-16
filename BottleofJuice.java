public class BottleofJuice extends Product {
    private float volume;
    private String type;

    public float getVolume() {
        return volume;
    }

    public BottleofJuice(String brand, String name, String type, float price, float volume) {
        super(brand, name, price);
        this.volume = volume;
        this.type = type;
    }

    /**
     * Переопределение метода displayInfo из класса Product
     * является примером Полиморфизма
     * так же для отображения нужного количества знаков после запятой используется %.2f
     *
     * @return изменный формат строки с добавлением нового параметра из класса BottleofJuice
     */
    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("Бренд: %-10s |Вкус: %-10s|Цена: %-6.2f |Объем: %.1f", brand, type, price, volume);
    }

}

