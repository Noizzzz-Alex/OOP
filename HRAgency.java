import java.util.ArrayList;

public class HRAgency implements Publisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    private ArrayList<Vacancy> vacansies = new ArrayList<>();


    /**
     * Добавление соискателей в список subscribers
     *
     * @param subscriber передаем соискателя
     */
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    /**
     * Уведомление соискателя о новой вакансии
     *
     * @param vacancy пока что текстом
     */
    @Override
    public void notifySubscriber(Vacancy vacancy, Publisher publisher) {
        subscribers.forEach(subscriber -> subscriber.showNotification(vacancy, publisher));
    }

    /**
     * после получения уведомления о принятии вакансии она снимается с публикации
     * @param vacancy вакансия на вход
     */
    @Override
    public void notifyAcceptVacancy(Vacancy vacancy) {
        if ((!vacansies.isEmpty()) && (vacansies.contains(vacancy))) {
            System.out.printf("Вакансия %10s %7s компании %8s снята с публикации\n",
                    vacancy.getTitleVacancy(), vacancy.getNeedCompetence(), vacancy.getNameCompany());
            vacansies.remove(vacancy);
        }
    }


    /**
     * Добавление новой вакансии в список
     *
     * @param vacancy передаем вакансию
     */
    public void uploadNewVacancy(Vacancy vacancy, Publisher publisher) {
        vacansies.add(vacancy);
        notifySubscriber(vacancy, publisher);
    }
}
