public abstract class Employee {
    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public Employee(String name, String lastName, int old, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.old = old;
        this.salary = salary;
    }

    protected String name;
    protected int old;
    protected String lastName;
    protected double salary;
    abstract double calculateSalary();
    abstract String getClassEmployee();
//    public String getInfo(){
//        return String.format("Сотрудник: %s %s | Средняя з/п : %.2f",name,lastName,salary);
//    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s | Средняя з/п : %.2f",name,lastName,salary);
    }

}
