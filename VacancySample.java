abstract class VacancySample {
    protected LegalEntity company;
    protected String title;
    protected Boolean type;
    protected String competition;
    protected float salary;
    protected int amountEmployees;

    public VacancySample(LegalEntity company, String title, Boolean type, String competition, float salary, int amountEmployees) {
        this.company = company;
        this.title = title;
        this.type = type;
        this.competition = competition;
        this.salary = salary;
        this.amountEmployees = amountEmployees;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAmountEmployees() {
        return amountEmployees;
    }

    public void setAmountEmployees(int amountEmployees) {
        this.amountEmployees = amountEmployees;
    }

    @Override
    public String toString() {
        return String.format("Компания: %s | Вакансия: %7s%15s | Удаленка: %b | Оплата: %.2f$ | Требуется:%2d сотрудник(ов) ",
                company.name,competition,title,type,salary,amountEmployees);
    }
}
