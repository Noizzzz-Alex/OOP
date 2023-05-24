package observer;

import java.util.List;
import java.util.Random;

public class Company implements ActionsWithVacancies {

    private Random random;
    private String nameCompany;
    private double maxSalary;
    private Publisher jobAgency; //зависимость через абстракцию(интерфейс Publisher)
    private List<VacancyBuilder> vacancies;



    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    /**
     * поиск сотрудника
     */
    public void needEmployee() {
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffers(nameCompany, salary);
    }

    @Override
    public void addVacancy(Vacancy vacancy) {
        vacancies.add(vacancy);
    }

    @Override
    public void removeVacancy(Vacancy vacancy) {
        vacancies.remove(vacancy);
    }
}
