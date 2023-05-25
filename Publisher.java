public interface Publisher {
    void showNotificationAcceptVacancy(Subscriber subscriber,String message,VacancySample vacancy);
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);

    void addVacancy(VacancySample vacancy);
    void removeVacancy(VacancySample vacancy);
    void registerCompany(Employer company);
    void unregisterCompany(Employer company);
}
