import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mainMenu {
    public static void displayInfo(ArrayList<Box> warehouse) {
        if (!warehouse.isEmpty()) {
            for (int i = 0; i < warehouse.size(); i++){
                System.out.printf("%d. %s\n",i+1,warehouse.get(i));
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
                    Фруктовый склад :
                    ___________________________________
                    1 - Добавить коробку апельсинов на склад
                    2 - Добавить коробку яблок на склад
                    3 - Все коробки на складе
                    4 - Объеднить две коробки
                    5 - Сравнить вес коробок
                    ___________________________________
                    0 - Выход""");
            System.out.print("Choice: ");
            str = sc.nextLine();
            if (str.equals("1")) {
                System.out.println("Сколько фруктов положить в коробку?");
                System.out.print("Ожидание ввода: ");
                str = sc.nextLine();
                int temp = Integer.parseInt(str);
                System.out.println(temp);
                try {
                    Box<Orange> orangeBox = new Box<>();
                    for (int i = 0; i <= temp; i++) {
                        Orange orange = new Orange(random.nextFloat(100, 350));
                        orangeBox.addFruit(orange);
                    }
                    boxes.add(orangeBox);
                } catch (Exception e) {
                    throw new RuntimeException("Ошибка ввода");
                }
            }
            if (str.equals("2")) {
                System.out.println("Сколько фруктов положить в коробку?");
                str = sc.nextLine();
                try {
                    Box<Apple> appleBox = new Box<>();
                    for (int i = 0; i < Integer.parseInt(str); i++) {
                        Apple apple = new Apple(random.nextFloat(100, 200));
                        appleBox.addFruit(apple);
                    }
                    boxes.add(appleBox);
                } catch (Exception e) {
                    throw new RuntimeException("Ошибка ввода");
                }
            }
            if (str.equals("3")) {
                displayInfo(boxes);
            }
            if (str.equals("4")) {
                System.out.println("Введите № коробки");
                String box1 = sc.nextLine();
                System.out.println("Введите № коробки");
                String box2 = sc.nextLine();
                boxes.get(Integer.parseInt(box1)-1).transferFruitsTo(boxes.get(Integer.parseInt(box2) - 1));
                    if (boxes.get(Integer.parseInt(box1)-1).getFruits().isEmpty()){
                        boxes.remove(Integer.parseInt(box1)-1);
                    }
            }
            if (str.equals("5")) {
                System.out.println("какую?(№ коробки)");
                String box1 = sc.nextLine();
                System.out.println("с какой? (№ коробки)");
                String box2 = sc.nextLine();
                System.out.println(boxes.get(Integer.parseInt(box1)-1).compare(boxes.get(Integer.parseInt(box2) - 1)));
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