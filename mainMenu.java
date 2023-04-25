import java.util.*;

public class mainMenu {
    public static void displayInfo(ArrayList<Employee> employees) {
        if (!employees.isEmpty()) {
            for (Employee e : employees) {
                System.out.println(e);
            }
        } else {
            System.out.println("Список пуст!");
        }
    }

    public static void Menu() {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!(str.equals("0"))) {
            System.out.println("""
                    Список сотрудников :
                    ___________________________________
                    1 - Создать случайного сотрудника
                    2 - Вывести список всех сотрудников
                    ___________________________________
                    Параметры сортировки:
                    ___________________________________
                    3 - по алфавиту возрастание
                    4 - по алфавиту убывание
                    5 - по возрасту возрастание
                    6 - по возрасту убывание
                    7 - по зар.плате возрастание
                    8 - по зар.плате убывание
                    ___________________________________
                    0 - Выход""");
            System.out.print("Choice: ");
            str = sc.nextLine();
            if (str.equals("1")) {
                employees.add(Generator.randomGenerate());
                System.out.println("Выполнено");
            }
            if (str.equals("2")) {
                displayInfo(employees);
                System.out.println("Выполнено");
            }
            //сортировка по алфавиту
            if (str.equals("3")) {
                employees.sort(new SortOfName());
                System.out.println("Выполнено");
                displayInfo(employees);
            }
            if (str.equals("4")) {
                employees.sort(new SortOfName().reversed());
                System.out.println("Выполнено");
                displayInfo(employees);
            }
            //сортировка по возрасту
            if (str.equals("5")) {
                employees.sort(new SortOfOld());
                System.out.println("Выполнено");
                displayInfo(employees);
            }
            if (str.equals("6")) {
                employees.sort(new SortOfOld().reversed());
                System.out.println("Выполнено");
                displayInfo(employees);
            }
            if (str.equals("7")) {
                employees.sort(new SortOfSalary());
                System.out.println("Выполнено");
                displayInfo(employees);
            }
            if (str.equals("8")) {
                employees.sort(new SortOfSalary().reversed());
                System.out.println("Выполнено");
                displayInfo(employees);
            }
        }
    }
}
