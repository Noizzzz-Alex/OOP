package observer;

public class Program {
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company geek = new Company("Geek",70000, jobAgency);
        Company google = new Company("Google",100000,jobAgency);
        Company yandex = new Company("Yandex",120000,jobAgency);
        Worker ivan = new Worker("Ivan");
        Worker sergey = new Worker("Sergey");
        Worker petr = new Worker("Petr");
        Student oleg = new Student("Oleg");
        Student maria = new Student("Maria");
        Student olga = new Student("Olga");
        Professional constantin = new Professional("Constantin");
        Professional alex = new Professional("Alex");
        Professional michael = new Professional("Michael");

        jobAgency.registerObserver(ivan);
        jobAgency.registerObserver(sergey);
        jobAgency.registerObserver(petr);
        jobAgency.registerObserver(oleg);
        jobAgency.registerObserver(maria);
        jobAgency.registerObserver(olga);
        jobAgency.registerObserver(constantin);
        jobAgency.registerObserver(alex);
        jobAgency.registerObserver(michael);


//        for (int i = 0; i <10; i++){
//            geek.needEmployee();
//            google.needEmployee();
//            yandex.needEmployee();
//
//        }
        Vacancy developer = new Vacancy("Developer",120000,yandex);
//        yandex.addVacancy(developer);
        System.out.println(developer.getAgree());

    }
}
