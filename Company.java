import java.util.ArrayList;
import java.util.List;

public class Company extends LegalEntity implements Employer {
    private List<Subscriber>employees = new ArrayList<>();


    public Company(String name, String country) {
        super(name, country);
    }


    @Override
    public void addEmployer(Subscriber subscriber) {
        employees.add(subscriber);
    }

    @Override
    public void removeEmployer(Subscriber subscriber) {
        employees.remove(subscriber);
    }

    @Override
    public void receiveNotification(Subscriber subscriber, String message) {
        System.out.println(message);
        System.out.println(subscriber);
        System.out.println("________________________________");
        addEmployer(subscriber);
    }
}
