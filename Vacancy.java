abstract class Vacancy {
    private String nameCompany;
    private String titleVacancy;
    private float salary;
    private String needCompetence;


    public Vacancy(String nameCompany, String titleVacancy, float salary, String needCompetence) {
        this.nameCompany = nameCompany;
        this.titleVacancy = titleVacancy;
        this.salary = salary;
        this.needCompetence = needCompetence;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public String getTitleVacancy() {
        return titleVacancy;
    }





    public float getSalary() {
        return salary;
    }

    public String getNeedCompetence() {
        return needCompetence;
    }

}
