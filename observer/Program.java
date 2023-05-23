package observer;

public class Program {
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company company = new Company("Geek",70000, jobAgency);
        Company company1 = new Company("Google",100000,jobAgency);
        Company company2 = new Company("Yandex",120000,jobAgency);
        Master master1 = new Master("Ivan");
        Master master2 = new Master("Sergey");
        Master master3 = new Master("Petr");
        Student student = new Student("Oleg");

        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(master3);
        jobAgency.registerObserver(student);

        for (int i = 0; i <10; i++){
            company.needEmployee();
            company1.needEmployee();
            company2.needEmployee();
        }

    }
}
