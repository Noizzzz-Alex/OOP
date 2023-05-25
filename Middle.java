public class Middle extends Employee implements Subscriber, CheckerVacancy {
    String accept = "\n>>>>>>Спасибо, откликнулся";
    String decline = "\n>>>>>>>>Спасибо, обойдусь";

    public Middle(String name, float minSalary, String competence) {
        super(name, minSalary, competence);
    }


    @Override
    public void showNotification(Publisher publisher, String message, VacancySample vacancySample) {
        System.out.printf("%s\n%s", message, vacancySample);
        check(vacancySample,publisher);

    }


    @Override
    public void check(VacancySample vacancy, Publisher publisher) {
        if (vacancy.salary < this.minSalary
                || !vacancy.competition.equals(this.competence)
                || vacancy.getAmountEmployees() == 0) {System.out.println(decline);} else {
            System.out.println(accept);
            publisher.showNotificationAcceptVacancy(this, accept, vacancy);
        }
    }
}
