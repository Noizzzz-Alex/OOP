package observer;

abstract class VacancyBuilder {
    private String titleVacancy;
    private double salary;
    private String nameCompany;
    private Company company;
    protected Boolean agree;

    public String getTitleVacancy() {
        return titleVacancy;
    }

    public void setTitleVacancy(String titleVacancy) {
        this.titleVacancy = titleVacancy;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void setAgree(Boolean agree) {
        this.agree = agree;
    }

    public Boolean getAgree() {
        return agree;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public VacancyBuilder(String titleVacancy, double salary, Company company) {
        this.titleVacancy = titleVacancy;
        this.salary = salary;
        this.nameCompany = company.getNameCompany();
    }

    @Override
    public String toString() {
        return String.format("| %8s | %8.2f | %-8s |", titleVacancy, salary, nameCompany);
    }

}
