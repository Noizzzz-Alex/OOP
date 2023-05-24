public class Student implements Subscriber {
    private String name;
    private float minSalary;
    private String competence;
    private Boolean isWorked = false;

    public Student(String name, float minSalary, String competence) {
        this.name = name;
        this.minSalary = minSalary;
        this.competence = competence;
    }

    /**
     * Уведомление соискателя о новой вакансии
     * @param vacancy получает на вход
     */
    @Override
    public void showNotification(Vacancy vacancy,Publisher publisher) {
        System.out.printf(">>>Уважаемый %-8s\nДля Вас есть новая вакансия:\n" +
                "| %8s | %8s | %.2f $ |\n",name, vacancy.getTitleVacancy(), vacancy.getNeedCompetence(),
                vacancy.getSalary());
        checkingTheVacancyForCompliance(vacancy,publisher);
    }

    /**
     * Проверка на соответствие вакансии и кандидата
     * @param vacancy передаем на вход
     */
    @Override
    public void checkingTheVacancyForCompliance(Vacancy vacancy,Publisher publisher) {
        if ((minSalary <= vacancy.getSalary())&&(competence.equals(vacancy.getNeedCompetence()))){
            minSalary = vacancy.getSalary();
            System.out.println(">>> Отклик на вакансию <<<");
            publisher.notifyAcceptVacancy(vacancy);
            isWorked = true;

        }else {
            System.out.println("Отклик остался без ответа");
        }
    }


}
