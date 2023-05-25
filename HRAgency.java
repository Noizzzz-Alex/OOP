import java.util.ArrayList;
import java.util.List;

public class HRAgency extends JobAgency implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private List<VacancySample> vacancies = new ArrayList<>();
    private List<Employer> companies = new ArrayList<>();


    private String notifySubscriber = ">>> Здраствуйте,для Вас появилась новая вакансия: <<<\n";
    private String notifyCompany = ">>> На Вашу вакансию откликнулся подходящий специалист <<<\n";
    public HRAgency(String name) {
        super(name);
    }

    ///////
    @Override
    public void showNotificationAcceptVacancy(Subscriber subscriber, String message, VacancySample vacancy) {
        System.out.println("Анкета кандидата ушла в компанию");
        if (!companies.isEmpty()) {
            for (Employer company : companies) {
                if (company.equals(vacancy.company)) {
                    company.receiveNotification(subscriber, notifyCompany);
                }
            }
        }

    }

    ////////
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void addVacancy(VacancySample vacancy) {
        vacancies.add(vacancy);
        if (!subscribers.isEmpty()) {
            for (Subscriber subscriber : subscribers) {
                subscriber.showNotification(this, notifySubscriber, vacancy);
            }
        } else {
            System.out.println("Нет кандидатов");
        }
    }

    @Override
    public void removeVacancy(VacancySample vacancy) {
        vacancies.remove(vacancy);
    }

    @Override
    public void registerCompany(Employer company) {
        companies.add(company);
    }

    @Override
    public void unregisterCompany(Employer company) {
        companies.remove(company);
    }
}
