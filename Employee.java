public abstract class Employee {
    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    protected String name;
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
