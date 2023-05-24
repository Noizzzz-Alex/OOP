package observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * реализация рассылки собщений
     * @param nameCompany название компании
     * @param salary зарплата
     */
    @Override
    public void sendOffers(String nameCompany, double salary) {
        for (Observer observer: observers) {
            observer.receiveOffer(nameCompany,salary);
        }
    }

    @Override
    public void sendVacancy(Vacancy vacancy) {
        for (Observer observer: observers) {
            observer.receiveVacancy(vacancy);
        }
    }
}
