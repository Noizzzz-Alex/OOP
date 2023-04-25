import java.util.*;

public class mainMenu {
    public static void displayInfo(ArrayList<Employee>employees) {
        if(!employees.isEmpty()){
            for (Employee e: employees) {
                System.out.println(e);
            }
        }
        else {
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
                    1 - Создать случайного сотрудника
                    2 - Вывести список всех сотрудников
                    3 - ^Сортировка по алфавиту
                    4 - 
                    4 - ^Сортировка по зар.плате
                    0 - Выход""");
            System.out.print("Choice: ");
            str = sc.nextLine();
            if (str.equals("1")) {
                employees.add(Generator.randomGenerate());
            }
            if (str.equals("2")) {
                displayInfo(employees);
            }
            if (str.equals("3")) {
                employees.sort(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee emp1, Employee emp2) {
                        return emp1.getName().compareTo(emp2.getName());
                    }
                });
                displayInfo(employees);
            }
            if (str.equals("4")) {
                employees.sort(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee emp1, Employee emp2) {
                        return Double.compare(emp1.calculateSalary(),emp2.calculateSalary());
                    }
                });
                displayInfo(employees);
            }
        }
    }
}
