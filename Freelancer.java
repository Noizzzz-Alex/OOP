public class Freelancer extends Employee{
    private int hours;

    public Freelancer(String name, String lastName,int old, double salary,int hours) {
        super(name, lastName,old, salary);
        this.hours = hours;
    }

    @Override
    double calculateSalary() {
        return salary * hours;
    }

    @Override
    public String toString() {
        return String.format("%-15s: %-10s%-10s | Возраст: %-3d| Ставка в  час : %-7.2f |" +
                        " Всего часов: %-3d | З/п в месяц: %.2f"
                ,getClassEmployee(),name,lastName,old,salary,hours,calculateSalary());
    }
    public String getClassEmployee(){
        return "Freelancer";
    }

}
