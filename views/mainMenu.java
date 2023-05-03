package views;

import java.util.Random;
import java.util.Scanner;

public class mainMenu {
    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!(str.equals("0"))) {
            System.out.println("""
                    Ресторан "У окна":
                    ___________________________________
                    1 - Забронировать столик
                    2 - Проверить бронь
                    3 - Изменить/удалить бронь
                    4 - Список брони по датам
                    5 - Текущиц список брони
                    ___________________________________
                    0 - Выход""");
            System.out.print("Выберите пункт меню: ");
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
        }
    }
}
