package observer;

public class Professional implements Observer{
    private String name;
    private double salary;

    public Professional(String name) {
        this.name = name;
        this.salary = 250000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary < salary) {
            System.out.printf(" -- Профессионал  %8s  >>>  Мне нужна эта работа    [%8s - %.2f ]\n",
                    name, nameCompany, salary);
            this.salary = salary;
        } else {
            System.out.printf("Профессионал  %8s  >>>  Я найду работу получше! [%8s - %.2f ]\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveVacancy(Vacancy vacancy) {

    }

    @Override
    public void agreeToVacancy() {

    }
}
