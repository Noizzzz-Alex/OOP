package observer;

public class Program {
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company company = new Company("Geek",70000, jobAgency);
        Company company1 = new Company("Google",100000,jobAgency);
        Company company2 = new Company("Yandex",120000,jobAgency);
        Worker worker1 = new Worker("Ivan");
        Worker worker2 = new Worker("Sergey");
        Worker worker3 = new Worker("Petr");
        Student student1 = new Student("Oleg");
        Student student2 = new Student("Maria");
        Student student3 = new Student("Olga");
        Professional professional1 = new Professional("Constantin");
        Professional professional2 = new Professional("Alex");
        Professional professional3 = new Professional("Michael");

        jobAgency.registerObserver(worker1);
        jobAgency.registerObserver(worker2);
        jobAgency.registerObserver(worker3);
        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(student3);
        jobAgency.registerObserver(professional1);
        jobAgency.registerObserver(professional2);
        jobAgency.registerObserver(professional3);


        for (int i = 0; i <10; i++){
            company.needEmployee();
            company1.needEmployee();
            company2.needEmployee();
        }

    }
}
