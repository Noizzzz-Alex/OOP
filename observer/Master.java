package observer;

public class Master implements Observer {
    private String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        this.salary = 80000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary < salary) {
            System.out.printf(" -- Мастер  %8s  >>>  Мне нужна эта работа    [%8s - %.2f ]\n",
                    name, nameCompany, salary);
            this.salary = salary;
        } else {
            System.out.printf("Мастер  %8s  >>>  Я найду работу получше! [%8s - %.2f ]\n",
                    name, nameCompany, salary);
        }
    }
}

