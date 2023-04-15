import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Product product3 = new Product("J7","Orange juice",150f);
//        System.out.println(product3.displayInfo());
//        BottleofWater bottleofWater = new BottleofWater("Вода","Источник",75.50f,2);
//        System.out.println(bottleofWater.displayInfo());
        Product bottleofWater2 = new BottleofWater("Вода","Нарзан",95.50f,1);
        Product bottleofMilk1 = new BottleofMilk("Milk","Magnit",55.5f,0.95f,2.5f);
        System.out.println(bottleofMilk1.displayInfo());
        System.out.println(bottleofWater2.displayInfo());
        List<Product> products = new ArrayList<Product>();
        products.add(bottleofMilk1);
        products.add(bottleofWater2);
        vendingMachine machine = new vendingMachine(products);

    }
}
