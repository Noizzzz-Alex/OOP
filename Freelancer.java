public class Freelancer extends Employee{
    private int hours;

    public Freelancer(String name, String lastName, double salary,int hours) {
        super(name, lastName, salary);
        this.hours = hours;
    }

    @Override
    double calculateSalary() {
        return salary * hours;
    }

    @Override
    public String toString() {
        return String.format("%-10s: %-10s%-10s | Ставка в  час : %-7.2f | Отработанных часов: %-3d | З/п в месяц: %.2f"
                ,getClassEmployee(),name,lastName,salary,hours,calculateSalary());
    }
    public String getClassEmployee(){
        return "Freelancer";
    }

}
