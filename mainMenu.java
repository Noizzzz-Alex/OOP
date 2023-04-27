import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mainMenu {
    public static void displayInfo(ArrayList<Box> warehouse) {
        if (!warehouse.isEmpty()) {
            for (Box<Fruit> box: warehouse) {
                for (Fruit fruit: box.getFruits()) {
                    System.out.println(fruit);
                }
            }
        } else {
            System.out.println("Список пуст!");
        }
    }

    public static void Menu() {
        Random random = new Random();
        ArrayList<Box> boxes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!(str.equals("0"))) {
            System.out.println("""
                    Коробки с фруктами :
                    ___________________________________
                    1 - Положить в коробку Апельсины
                    2 - Положить в коробку Яблоки
                    3 - Взвесить текущую коробку
                    4 - Взять новую коробку
                    5 - Все наполненные коробки
                    6 - Сравнить коробки по весу
                    7 - Пересыпать в коробку
                    8 - in process
                    ___________________________________
                    0 - Выход""");
            System.out.print("Choice: ");
            str = sc.nextLine();
            if (str.equals("1")) {
                System.out.println("Сколько вы хотите положить в коробку?");
                str = sc.nextLine();
                try {
                    Box<Orange> orangeBox = new Box<>();
                    for (int i = 0; i < Integer.parseInt(str); i++) {
                        Orange o = new Orange(random.nextFloat(100, 300));
                        orangeBox.addFruit(o);
                    }
                    boxes.add(orangeBox);
                } catch (Exception e) {
                    throw new RuntimeException("Ошибка ввода");
                }
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
                displayInfo(boxes);
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