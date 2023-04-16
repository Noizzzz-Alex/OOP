public class BottleofWater extends Product {
    private float volume;


    public BottleofWater(String name, String brand, float price, float volume) {
        super(name, brand, price);
        this.volume = volume;
    }

    /** Переопределение метода displayInfo из класса Product
     *  является примером Полиморфизма
     *  так же для отображения нужного количества знаков после запятой используется %.2f
     * @return изменный формат строки с добавлением нового параметра из класса BottleofWater
     */
    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("Название: %-10s |Цена: %.2f |Объем: %.1f",name, price,volume);
    }

    public float getVolume() {
        return volume;
    }
}
