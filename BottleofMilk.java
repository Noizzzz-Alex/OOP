
public class BottleofMilk extends Product{
    protected float fat;
    protected float volume;


    public BottleofMilk(String name, String brand, float price, float volume,float fat) {
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    /** Переопределение метода displayInfo из класса Product
     *  является примером Полиморфизма
     * @return изменный формат строки с добавлением нового параметра из классов BottleofWater и BottleofMilk
     */
    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("Название: %-15s |Цена: %-6.2f |Объем: %-4.2f |Жирность: %.1f",name, price,volume,fat);
    }

    public float getVolume() {
        return volume;
    }
}
