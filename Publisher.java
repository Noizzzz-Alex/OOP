public interface Publisher {
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscriber(Vacancy vacancy,Publisher publisher);
    public void notifyAcceptVacancy(Vacancy vacancy);
}
