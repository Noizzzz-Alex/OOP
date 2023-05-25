public interface Employer {
    void addEmployer(Subscriber subscriber);
    void removeEmployer(Subscriber subscriber);
    void receiveNotification(Subscriber subscriber,String message);
}
