import java.util.ArrayList;
import java.util.Scanner;

public class mainMenu {
    public static void displayInfo(ArrayList<Box> fruits) {
        if (!fruits.isEmpty()) {
            for (Box f : fruits) {
                System.out.println(f);
            }
        } else {
            System.out.println("Список пуст!");
        }
    }

    public static void Menu() {
        ArrayList<Box> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!(str.equals("0"))) {
            System.out.println("""
                    Коробки с фруктами :
                    ___________________________________
                    1 - in process
                    2 - in process
                    3 - in process
                    4 - in process
                    5 - in process
                    6 - in process
                    7 - in process
                    8 - in process
                    ___________________________________
                    0 - Выход""");
            System.out.print("Choice: ");
            str = sc.nextLine();
            if (str.equals("1")) {
                return;
            }
            if (str.equals("2")) {
                return;
            }
            if (str.equals("3")) {
                return;
            }
            if (str.equals("4")) {
                return;
            }
            if (str.equals("5")) {
                return;
            }
            if (str.equals("6")) {
                return;
            }
            if (str.equals("7")) {
                return;
            }
            if (str.equals("8")) {
                return;
            }
        }
    }
}