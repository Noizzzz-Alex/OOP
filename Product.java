public class Product {
    protected String name;
    protected String brand;
    protected float price;


    /**
     * Получить информацию по продукту
     *
     * @return Информация по продукту
     */
    String displayInfo() {
        return String.format("%s | %s | %f", brand, name, price);
    }

    public Product() {
        this("Продукт");
    }

    public Product(String name) {
        this(name, "Noname");

    }


    public Product(String name, String brand) {
        this(name, brand, 99.55f);
    }


    public Product(String inputBrand, String inputName, float inputPrice) {
        if (inputName.length() <= 3)
            name = "No name";
        else
            name = inputName;
        if (inputPrice < 0)
            price = 1;
        else price = inputPrice;
        if (inputBrand.length() < 2)
            brand = "No name brand";
        else
            brand = inputBrand;
    }

    /**Метод геттер или акцессер(accessor)
     * получение цены
     * @return цену
     */
    public float getPrice() {
        return price;
    }

    /** Метод сеттер или мьютейтор (mutator)
     * в даном методе так же можно сделать исклчения и проверки на правильность нового значения
     * @param price устанавливает новое значение для поля price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
//сгенерированные геттер и сеттер для NAME
    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }
    //сгенерированные геттер и сеттер для Brand
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
