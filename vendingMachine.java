import java.util.List;
import java.util.Objects;

public class vendingMachine {
    public static  List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public vendingMachine(List<Product> products) {
        vendingMachine.products = products;
    }

    public static void getProduct(String name) {
        for (Product product : products) {
            if (product instanceof BottleofWater) {
                if (Objects.equals(product.getName(), name)) {
                    System.out.println("Thank You For Your Purchase");
                    System.out.println(product.displayInfo());
                    return;
                }
            }
            if (product instanceof BottleofMilk) {
                if (Objects.equals(product.getName(), name)){
                    System.out.println("Thank You For Your Purchase");
                    System.out.println(product.displayInfo());
                    return;
                }
            }
            if (product instanceof BottleofJuice) {
                if (Objects.equals(product.getName(), name)){
                    System.out.println("Thank You For Your Purchase");
                    System.out.println(product.displayInfo());
                    return;
                }
            }
            if (product instanceof JarOfCoffee) {
                if (Objects.equals(product.getName(), name)){
                    System.out.println("Thank You For Your Purchase");
                    System.out.println(product.displayInfo());
                    return;
                }
            }

        }
    }

    public static void showProduct(String str) {
        if (str.equals("1"))
            for (Product product : products) {
                if (product instanceof BottleofWater) {
                    System.out.println(product.displayInfo());
                }
            }
        if (str.equals("2"))
            for (Product product : products) {
                if (product instanceof BottleofMilk) {
                    System.out.println(product.displayInfo());
                }
            }
        if (str.equals("3"))
            for (Product product : products) {
                if (product instanceof BottleofJuice) {
                    System.out.println(product.displayInfo());
                }
            }
        if (str.equals("4"))
            for (Product product : products) {
                if (product instanceof JarOfCoffee) {
                    System.out.println(product.displayInfo());
                }
            }
    }

    /*
    вода - объем 0,5(святой источник,нарзан,борджоми)
    молоко - объем 0,5; жирность 2,5 и 3,2(Коровкино, Магнит, Молочник)
    Кофе - объем 0,33; крепость (1-латте, 2-капучино, 3-американо, 4-эспрессо)(StarBacks,Lotte)
    Сок - объем 0,5; тип(яблочный,апельсиновый,ананасовый)

     */
//    public static void mainMenu() {
//        System.out.println("in Stock Is :\n" +
//                "1 - Water\n" +
//                "2 - Milk\n" +
//                "3 - Coffee\n" +
//                "4 - Juice");
//        System.out.print("Choice: ");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        while (!(str.equals("0"))) {
//            if (str.equals("1")) {
//                System.out.println("in Stock:");
//                //showProduct(str); выдает что нужен static для метода showProduct; пока не разобрался с проблемой
//            }
//        }
//    }

}
