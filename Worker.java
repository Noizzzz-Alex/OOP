public class Worker extends Employee {
    private int workDays;

    public Worker(String name, String lastName,int old, double salary, int workDays) {
        super(name, lastName,old, salary);
        this.workDays = workDays;
    }

    @Override
    double calculateSalary() {
        return workDays * salary;
    }

    @Override
    String getClassEmployee() {
        return "Worker";
    }

    @Override
    public String toString() {
        return String.format("%-10s: %-10s%-10s | Ставка в день : %-7.2f | Отработанных дней : %-3d | З/п в месяц: %.2f"
                , getClassEmployee(), name, lastName, salary, workDays, calculateSalary());

    }
}
