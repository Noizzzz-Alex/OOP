import java.util.List;
import java.util.Scanner;

public class mainMenu {
    public static void Menu(List<Cat> cats, Plate plate) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!(str.equals("0"))) {
            System.out.println("""
                    Кормушка :
                    1 - Покормить котов
                    2 - Добавить еды в кормушку
                    3 - Информация о котах
                    4 - Информация о наличии еды
                    0 - Выход""");
            System.out.print("Choice: ");
            str = sc.nextLine();
            if (str.equals("1")) {
                for (Cat cat : cats) {
                    if (plate.availabilityOfFood(cat)) {
                        cat.eat(plate);
                    }
                    else {
                        System.out.println("Кот не притронулся к еде, т.к еды мало.");
                    }

                }
            }
            if (str.equals("2")) {
                System.out.print("Сколько добавить?: ");
                str = sc.nextLine();
                plate.setFood(Integer.parseInt(str));
            }
            if (str.equals("3")) {
                for (Cat cat : cats) {
                    cat.getInfo();
                }
            }
            if (str.equals("4")) {
                plate.info();
            }
        }
    }
}
