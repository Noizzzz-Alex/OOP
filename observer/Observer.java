package observer;

/**
 * интерфейс наблюдателя(соискателя)
 */
public interface Observer {
    void receiveOffer(String nameCompany, double salary);
    void receiveVacancy(Vacancy vacancy);
    void agreeToVacancy();
}
