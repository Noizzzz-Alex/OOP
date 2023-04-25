import java.util.ArrayList;
import java.util.Scanner;

public class mainMenu {
    public static void Menu() {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!(str.equals("0"))) {
            System.out.println("""
                    Список сотрудников :
                    1 - Создать рабочего
                    2 - Создать фрилансера
                    3 - Создать случайного сотрудника
                    4 - Вывести список всех сотрудников
                    0 - Выход""");
            System.out.print("Choice: ");
            str = sc.nextLine();
            if (str.equals("1")) {
                employees.add(Generator.generateWorker());
            }
            if (str.equals("2")) {
                employees.add(Generator.generateFreelancer());
            }
            if (str.equals("3")) {
                employees.add(Generator.randomGenerate());
            }
            if (str.equals("4")) {

                if(!employees.isEmpty()){
                    for (Employee e: employees) {
                        System.out.println(e);
                    }
                }
                else {
                    System.out.println("Список пуст!");
                }

            }
        }
    }
}
