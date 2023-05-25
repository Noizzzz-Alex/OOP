abstract class Employee implements Subscriber {
    protected String name;
    protected float minSalary;
    protected String competence;

    public Employee(String name, float minSalary, String competence) {
        this.name = name;
        this.minSalary = minSalary;
        this.competence = competence;
    }

    @Override
    public String toString() {
        return String.format("|Кандидат: %s | Уровень: %s | Мин.требование к з/п: %.2f |",
                name,competence,minSalary);
    }
}
