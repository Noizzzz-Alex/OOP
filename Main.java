import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Product product3 = new Product("J7","Orange juice",150f);
//        System.out.println(product3.displayInfo());
//        BottleofWater bottleofWater = new BottleofWater("Вода","Источник",75.50f,2);
//        System.out.println(bottleofWater.displayInfo());
        Product bW1 = new BottleofWater("Вода", "Нарзан", 50.0f, 0.5f);
        Product bW2 = new BottleofWater("Вода", "Касмала", 60.0f, 0.5f);
        Product bW3 = new BottleofWater("Вода", "Боржоми", 70.0f, 0.5f);
        Product bW4 = new BottleofWater("Вода", "Есентуки", 80.0f, 0.5f);
        Product bW5 = new BottleofWater("Вода", "Источник", 90.0f, 0.5f);

        Product bM1 = new BottleofMilk("Milk", "Magnit", 50.5f, 0.95f, 2.5f);
        Product bM2 = new BottleofMilk("Milk", "Magnit", 55.5f, 0.95f, 3.2f);
        Product bM3 = new BottleofMilk("Milk", "WhiteCastle", 51.5f, 0.95f, 2.5f);
        Product bM4 = new BottleofMilk("Milk", "WhiteCastle", 56.5f, 0.95f, 3.2f);
        Product bM5 = new BottleofMilk("Milk", "Cow", 65.5f, 0.95f, 2.5f);


        Product bJ1 = new BottleofJuice("J7", "Сок натуральный", "Яблоко", 77.0f, 0.5f);
        Product bJ2 = new BottleofJuice("Добрый", "Сок натуральный", "Персик", 55.5f, 0.5f);
        Product bJ3 = new BottleofJuice("Не добрый", "Сок натуральный", "Ананас", 97.0f, 0.5f);
        Product bJ4 = new BottleofJuice("G9", "Сок натуральный", "Груша", 60.0f, 0.5f);
        Product bJ5 = new BottleofJuice("Злыдня", "Сок натуральный", "Томат", 167.5f, 0.5f);

        Product jC1 = new JarOfCoffee("StarBacks","Латте",1,115f,0.33f);
        Product jC2= new JarOfCoffee("StarBacks","Капучино",2,125f,0.33f);
        Product jC3 = new JarOfCoffee("StarBacks","Американо",3,135f,0.33f);
        Product jC4 = new JarOfCoffee("StarBacks","Эспрессо",4,145f,0.33f);
        Product jC5 = new JarOfCoffee("StarBacks","Без кофеина",0,75f,0.33f);


        List<Product> products = new ArrayList<>();

        products.add(bW1);products.add(bW2);products.add(bW3);products.add(bW4);products.add(bW5);
        products.add(bJ1);products.add(bJ2);products.add(bJ3);products.add(bJ4);products.add(bJ5);
        products.add(bM1);products.add(bM2);products.add(bM3);products.add(bM4);products.add(bM5);
        products.add(jC1);products.add(jC2);products.add(jC3);products.add(jC4);products.add(jC5);

        vendingMachine machine = new vendingMachine(products);
        mainMenu.Menu();


    }
}
