package observer;

public class Student implements Observer {
    private String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        this.salary = 5000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary <= salary) {
            System.out.printf(">>>%15s %-10s подтвердил оффер [ %8s - %.2f ]",getClass(),name,nameCompany,salary);
            this.salary = salary;
        } else {
            System.out.printf("Студент %8s  >>>  Я найду работу получше! [%8s - %.2f ]\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveVacancy(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()) {
            System.out.printf(">>>%15s %-10s согласен и ожидает оффера",getClass(),name);
            vacancy.setAgree(true);
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("---%15s %-10s не согласен и ищет дальше",getClass(),name);
            vacancy.setAgree(false);
        }
    }

    @Override
    public void agreeToVacancy() {

    }

}
