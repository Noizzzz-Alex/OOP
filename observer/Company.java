package observer;

import java.util.Random;
import java.util.concurrent.Flow;

public class Company {

    private Random random;
    private String nameCompany;
    private double maxSalary;
    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    /**
     * поиск сотрудника
     */
    public void needEmployee(){
        double salary = random.nextDouble(3000,100000);
        jobAgency.sendOffers(nameCompany,salary);
    }
}
