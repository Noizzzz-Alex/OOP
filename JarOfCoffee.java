public class JarOfCoffee extends Product{
    private float volume;
    private String type;
    private int coffeeStrength;

    public JarOfCoffee(String brand,String type,int coffeeStrength, float price, float volume) {
        super(brand);
        this.volume = volume;
        this.type = type;
        this.coffeeStrength = coffeeStrength;
        this.price = price;
    }

    /**
     * Переопределение метода displayInfo из класса Product
     * является примером Полиморфизма
     * так же для отображения нужного количества знаков после запятой используется %.2f
     *
     * @return изменный формат строки с добавлением нового параметра из класса JarOfCoffee
     */
    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("Бренд: %-10s |Вид кофе: %-13s |Крепость: %-1d |Цена: %-6.2f |Объем: %-3.1f",
                brand, type,coffeeStrength,price, volume);
    }

}
