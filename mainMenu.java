import java.util.List;
import java.util.Scanner;

public class mainMenu {
    public static void Menu() {
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
        }
    }
}
