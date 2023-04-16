import java.util.List;
import java.util.Scanner;

public class mainMenu extends vendingMachine{

    public mainMenu(List<Product> products) {
        super(products);
    }
    public static void Menu() {

        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!(str.equals("0"))) {
            System.out.println("""
                in Stock Is :
                1 - Water
                2 - Milk
                3 - Juice
                4 - Coffee""");
            System.out.print("Choice: ");
            str = sc.nextLine();
            if (str.equals("1")) {

                System.out.println("in Stock:");
                vendingMachine.showProduct(str);
                System.out.println("Input name of product for buy or push 'Enter' for return back");
                str = sc.nextLine();
                vendingMachine.getProduct(str);

            }
            if (str.equals("2")) {

                System.out.println("in Stock:");
                vendingMachine.showProduct(str);
                System.out.println("Input name of product for buy or push 'Enter' for return back");
                str = sc.nextLine();
                vendingMachine.getProduct(str);
            }
            if (str.equals("3")) {

                System.out.println("in Stock:");
                vendingMachine.showProduct(str);
                System.out.println("Input name of product for buy or push 'Enter' for return back");
                str = sc.nextLine();
                vendingMachine.getProduct(str);
            }
            if (str.equals("4")) {

                System.out.println("in Stock:");
                vendingMachine.showProduct(str);
                System.out.println("Input name of product for buy or push 'Enter' for return back");
                str = sc.nextLine();
                vendingMachine.getProduct(str);
            }
        }
    }

}
