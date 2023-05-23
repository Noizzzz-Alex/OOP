package observer;

public interface Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void  sendOffers(String nameCompany, double salary);
}
